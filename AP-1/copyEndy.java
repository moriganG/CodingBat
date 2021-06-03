// We'll say that a positive int n is "endy" if it is in the range 0..10 or 90..100 (inclusive). Given an array of positive ints,
// return a new array of length "count" containing the first endy numbers from the original array. 
// Decompose out a separate isEndy(int n) method to test if a number is endy. The original array will contain at least "count" endy numbers.

public int[] copyEndy(int[] nums, int count) {
  int index = 0;
  int[] myArr = new int[count];
  for (int i = 0; index < count; i++){
    if (isEndy(nums[i])){
      myArr[index] = nums[i];
      index++;
    }
  }
  return myArr;
}

public boolean isEndy(int n) {
  return (n >= 0 && n <= 10) || (n >= 90 && n <= 100);
}
