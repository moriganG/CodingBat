// For each multiple of 10 in the given array, change all the values following it to be that multiple of 10,
// until encountering another multiple of 10. So {2, 10, 3, 4, 20, 5} yields {2, 10, 10, 10, 20, 20}.

public int[] tenRun(int[] nums) {
  int multip = 1;
  boolean tenDivisor = false;
  for(int i = 0; nums.length > i; i++){
    if (nums[i] % 10 == 0){
      multip = nums[i] / 10;
      tenDivisor = true;
    }
    if (tenDivisor){
      nums[i] = 10 * multip;
    }
  }
  return nums;
}
