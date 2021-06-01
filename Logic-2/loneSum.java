/* Given 3 int values, a b c, return their sum. However, if one of the values 
 * is the same as another of the values, it does not count towards the sum.
 */
public int loneSum(int a, int b, int c) {
  if (a != b && b != c && a != c){
    return a + b + c;
  }
  else if (a != b && b == c){
    return a;
  }
  else if(a == b && b != c){
    return c;
  }
  else if (a == c && b != c){
    return b;
  }
  else {
    return 0;
  }
}
