// Given an array of ints, return true if the array contains two 7's next to each other, or there are two 7's separated by one element, such as with {7, 1, 7}.

public boolean has77(int[] nums) {
  for (int i = 1; nums.length - 1 > i; i++){
    if ((nums[i] == 7 && nums[i + 1] == 7) || (nums[i] != 7 && nums[i + 1] == 7 
            && nums[i - 1] == 7) || nums[0] == 7 && nums[1] == 7){
      return true;
    }
  }
  return false;
}
