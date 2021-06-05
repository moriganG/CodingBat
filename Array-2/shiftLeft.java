// Return an array that is "left shifted" by one -- so {6, 2, 5, 3} returns {2, 5, 3, 6}. You may modify and return the given array, or return a new array.

public int[] shiftLeft(int[] nums) {
  int[] myArray = new int[nums.length];
  for (int i = 0; nums.length - 1 > i; i++){
    myArray[i] = nums[i + 1];
  }
  if (myArray.length >= 1){
    myArray[myArray.length - 1] = nums[0];
  }
  return myArray;
}
