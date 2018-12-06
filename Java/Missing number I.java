public class Solution {
  public int missing(int[] array) {
    // Write your solution here
    //bit operation
    if(array == null || array.length < 1){
      return 1;
    }
    int xor = array[0];
    for(int i = 1; i < array.length; i++){
      xor ^= array[i];
    }
    for(int i = 1; i <= array.length+1; i++){
      xor ^= i;
    }
    return xor;
    
  }
  //another solution: hashset
  // or: gaussian sum - sum(array[i]) -> but might overeflow!
}
