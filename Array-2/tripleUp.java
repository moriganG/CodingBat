// Return true if the array contains, somewhere, three increasing adjacent numbers like .... 4, 5, 6, ... or 23, 24, 25.

public boolean tripleUp(int[] nums) {
  for (int i = 0; nums.length - 2 > i; i++){
    if (nums[i] + 2 == nums[i + 1] + 1 && nums[i + 1] + 1 == nums[i + 2]){
      return true;
    }
  }
  return false;
}
