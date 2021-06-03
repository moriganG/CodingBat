//Loop over the given array of strings to build a result string like this: 
//when a string appears the 2nd, 4th, 6th, etc. time in the array, append the string to the result. 
//Return the empty string if no string appears a 2nd time.

public String wordAppend(String[] strings) {
  Map <String, Integer> map = new HashMap();
  int count = 0;
  String result = "";
  for (String s : strings){
    if (map.containsKey(s)){
      count = map.get(s);
      map.put(s, count + 1);
      if (map.get(s) % 2 == 0){
        result += s;
      }
    } else {
      map.put(s, 1);
      count = 1;
    }
  }
  return result;
}
