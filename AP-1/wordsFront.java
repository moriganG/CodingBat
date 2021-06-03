// Given an array of strings, return a new array containing the first N strings. N will be in the range 1..length.

public String[] wordsFront(String[] words, int n) {
  StringBuilder myString = new StringBuilder();
  for (int i = 0; i < words.length; i++){
    if (i == n - 1){
      for (int j = 0; j < n; j++){
        myString.append(words[j]);
        myString.append("_");
      }
    }
  }
  
  String myString2 = myString.toString();
  String[] ary = myString2.split("_");
  
  return ary;
}
