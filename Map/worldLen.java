//Given an array of strings, return a Map<String, Integer> containing a key for every different string in the array, and the value is that string's length.

public class WordLen {

    public Map<String, Integer> wordLen(String[] strings) {

        Map<String, Integer> map=new HashMap<String, Integer>();
        for (String s: strings) {
            map.put(s, s.length());
        }

        return map;
    }
}

//or

public Map<String, Integer> wordLen(String[] strings) {
  Map <String, Integer> map = new HashMap();
  for (int i = 0; i < strings.length; i++){
    for (int j = 0; j < strings.length; j++){
      if (strings[j] != strings[i]){
        map.put(strings[j], strings[j].length());
      }
    }
  }
  if (strings.length == 1){
    map.put(strings[0], strings[0].length());
  }
  if (strings.length == 0){
    return map;
  }
  return map;
}
