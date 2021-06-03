// Given a positive int n, return true if it contains a 1 digit. Note: use % to get the rightmost digit, and / to discard the rightmost digit.

public boolean hasOne(int n) {
  while (n > 0){
  int helper = 0;
  helper = n % 10;
  if (helper == 1){
    return true;
  }
  n = n / 10;
  }
  return false;
}
