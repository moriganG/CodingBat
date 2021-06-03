// We'll say that a positive int divides itself if every digit in the number divides into the number evenly. 
// So for example 128 divides itself since 1, 2, and 8 all divide into 128 evenly. 
// We'll say that 0 does not divide into anything evenly, so no number with a 0 digit divides itself.

public boolean dividesSelf(int n) {
  int numb = n;
  int helper = 0;
  while (n > 0){
  helper = n % 10;
  if (helper == 0){
    return false;
  }
  if (numb % helper != 0){
    return false;
  }
  n = n / 10;
  }
  return true;
}
