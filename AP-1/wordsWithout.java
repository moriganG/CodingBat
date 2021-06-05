// Given an array of strings, return a new array without the strings that are equal to the target string.
// One approach is to count the occurrences of the target string, make a new array of the correct length, and then copy over the correct strings.

public String[] wordsWithout(String[] words, String target) {
  int counter = 0;
  for (int i = 0; words.length > i; i++){
    if (words[i].equals(target)){
      counter++;
    }
  }
  String[] myStringArray = new String[words.length - counter];
  int k = 0;
  for (int j = 0; words.length > j; j++){
    if (!(words[j].equals(target))){
      myStringArray[k] = words[j];
      k++;
    }
  }
  return myStringArray;
}
