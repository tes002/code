//Assumption: The given string is not null; n >= 0.
// right shift: reverse the last n char; if left shift: reverse the first n char.
public class Solution {
  public String rightShift(String input, int n) {
    // Write your solution here
    //To exchange 2 blocks in a string: reverse them separately -> reverse the whole string
    if (input.length() <= 1){
    	return input;
    }
    n %= input.length();   //n might be larger than length
    char[] array = input.toCharArray();
    reverse(array, array.length - n, array.length - 1);
    reverse(array, 0, array.length - n - 1);
    reverse(array, 0, array.length - 1);
    return new String(array);
  }
  private void reverse(char[] array, int left, int right){
  	while(left < right){
    	char temp = array[left];
      array[left] = array[right];
      array[right] = temp;
      left++;
      right--;
    }
  }
}
