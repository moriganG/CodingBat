// Given an array of ints, return true if the array contains a 2 next to a 2 or a 4 next to a 4, but not both.

public boolean either24(int[] nums) {
  boolean flag2 = true;
  boolean flag4 = true;
  for (int i = 0; nums.length - 1 > i; i++){
    if (nums[i] == 2 && nums[i + 1] == 2){
      flag2 = false;
    }
    if (nums[i] == 4 && nums[i + 1] == 4){
      flag4 = false;
    }
  }
  return flag2 != flag4;
}
