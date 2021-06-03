// The classic word-count algorithm: given an array of strings, 
// return a Map<String, Integer> with a key for each different string, 
// with the value the number of times that string appears in the array.

public Map<String, Integer> wordCount(String[] strings) {
  Map <String, Integer> map = new HashMap();
  int counter = 1;
  for (String s: strings){
    if (map.containsKey(s)){
      counter = map.get(s);
      map.put(s, counter + 1);
    }else{
      counter = 1;
      map.put(s, counter);
    }
  }
  return map;
}
