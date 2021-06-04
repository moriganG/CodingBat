// Given an array of ints, return true if it contains no 1's or it contains no 4's.

public boolean no14(int[] nums) {
  boolean flag4 = true;
  boolean flag1 = true;
  for (int i = 0; nums.length > i; i++){
    if (nums[i] == 4){
      flag4 = false;
    }
    if (nums[i] == 1){
      flag1 = false;
    }
  }
  return flag4 || flag1;
}
