// Return the "centered" average of an array of ints, which we'll say is the mean average of the values, 
// except ignoring the largest and smallest values in the array. If there are multiple copies of the smallest value, 
// ignore just one copy, and likewise for the largest value. Use int division to produce the final average. You may assume that the array is length 3 or more.



public int centeredAverage(int[] nums) {
  int sumOfNums = 0;
  int numsMin = nums[0];
  int numsMax = nums[0];
  for (int i = 0; nums.length > i; i++){
      sumOfNums += nums[i];
      numsMin = Math.min(numsMin, nums[i]);
      numsMax = Math.max(numsMax, nums[i]);
  }
  sumOfNums = sumOfNums - numsMin - numsMax;
  return sumOfNums / (nums.length - 2);
}
