// Given two arrays, A and B, of non-negative int scores. A "special" score is one which is a multiple of 10, such as 40 or 90. 
// Return the sum of largest special score in A and the largest special score in B.

public int scoresSpecial(int[] a, int[] b) {
  return sumSpecialNum(a) + sumSpecialNum(b);
}

public int sumSpecialNum(int[] nums) {
  int maxTen = 0;
  
  for(int i = 0; nums.length > i; i++){
    if (nums[i] % 10 == 0){
      if (nums[i] > maxTen){
        maxTen = nums[i];
      }
    }
  }
  return maxTen;
}
