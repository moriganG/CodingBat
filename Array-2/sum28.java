// Given an array of ints, return true if the sum of all the 2's in the array is exactly 8.

public boolean sum28(int[] nums) {
  int sumOfTwos = 0;
  for (int i = 0; nums.length > i; i++){
    if (nums[i] == 2){
      sumOfTwos += nums[i];
    }
  }
  return sumOfTwos == 8 ? true : false;
}
