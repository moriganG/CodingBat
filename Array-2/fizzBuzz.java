public String[] fizzBuzz(int start, int end) {
  String[] myStringArray = new String[end - start];
  int j = 0;
  for (int i = start; end > i; i++){
    if (i % 15 == 0){
      myStringArray[j] = "FizzBuzz";
    }
    else if (i % 3 == 0){
      myStringArray[j] = "Fizz";
    }
    else if (i % 5 == 0){
      myStringArray[j] = "Buzz";
    } else {
      myStringArray[j] = String.valueOf(i);
    }
    j++;
  }
  return myStringArray;
}
