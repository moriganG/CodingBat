// Given an array of strings, return the count of the number of strings with the given length.

public int wordsCount(String[] words, int len) {
  int count = 0;
  for (String s : words){
    if (s.length() == len){
      count++;
    }
  }
  return count;
}
