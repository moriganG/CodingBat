// Given an array of ints, return true if every element is a 1 or a 4.

public boolean only14(int[] nums) {
  for (int i = 0; nums.length > i; i++){
    if (nums[i] != 4 && nums[i] != 1){
      return false;
    }
  }
  return true;
}
