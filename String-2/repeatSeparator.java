//Given two strings, word and a separator sep, return a big string made of count occurrences of the word, separated by the separator string.


public String repeatSeparator(String word, String sep, int count) {
  if (count == 1){
    return word;
  }
  if (count == 0){
    return "";
  }
  String myString = "";
  
  for (int i = 1; i < count; i++){
    myString += sep + word;
  }
  
  return word + myString;
}

// Or using StringBuffer

public String repeatSeparator(String word, String sep, int count) {
    if(count == 0)
        return "";
          
    StringBuffer result = new StringBuffer();
              
    for(int i = 0; i < count - 1; i++) {
        result.append(word);
        result.append(sep);
    }
                            
    return result.append(word).toString();
}
