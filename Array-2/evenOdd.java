// Return an array that contains the exact same numbers as the given array, but rearranged so that all the even numbers come before all the odd numbers.
// Other than that, the numbers can be in any order. You may modify and return the given array, or make a new array.

public int[] evenOdd(int[] nums) {
  int j = 0;
  int[] myArray = new int[nums.length];
  for (int i = 0; nums.length > i; i++){
    if(nums[i] % 2 == 0){
      myArray[j] = nums[i];
      j++;
    }
  }
  for (int l = 0; nums.length >l; l++){
    if(nums[l] % 2 != 0){
      myArray[j] = nums[l];
      j++;
    }
  }
  return myArray;
}
