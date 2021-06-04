// Return the number of even ints in the given array. Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.

public int countEvens(int[] nums) {
  int counter = 0;
  for (int i = 0; nums.length > i; i++){
    if (nums[i] % 2 == 0){
      counter++;
    }
  }
  return counter;
}
