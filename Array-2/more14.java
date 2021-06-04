// Given an array of ints, return true if the number of 1's is greater than the number of 4's

public boolean more14(int[] nums) {
  int sumOf1 = 0;
  int sumOf4 = 0;
  for (int i = 0; nums.length > i; i++){
    if (nums[i] == 1){
      sumOf1++;
    }
    if (nums[i] == 4){
      sumOf4++;
    }
  }
  return sumOf1 > sumOf4 ? true : false;
}
