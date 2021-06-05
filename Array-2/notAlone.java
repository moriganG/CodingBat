// We'll say that an element in an array is "alone" if there are values before and after it, and those values are different from it. 
// Return a version of the given array where every instance of the given value which is alone is replaced by whichever value to its left or right is larger.

public int[] notAlone(int[] nums, int val) {
  for (int i = 1; nums.length - 1 > i; i++){
    if (nums[i] == val){
       if (nums[i + 1] >= nums[i - 1] && nums[i] != nums[i - 1] && nums[i] != nums[i + 1]){
         nums[i] = nums[i + 1];
      } else {   
        nums[i] = nums[i - 1];
      }
    }
  }
  return nums;
}
