// Given an array of ints, return true if there is a 1 in the array with a 2 somewhere later in the array.

public boolean has12(int[] nums) {
  boolean flag1 = false;
  boolean flag2 = false;
  for (int i = 0; nums.length > i; i++){
    if (nums[i] == 1){
      flag1 = true;
    }
    if (nums[i] == 2 && flag1){
      flag2 = true;
    }
  }
  return flag2;
}
