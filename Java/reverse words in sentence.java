/**
Assumptions

Words are separated by single space

There are no heading or tailing white spaces
**/


public class Solution {
  public String reverseWords(String input) {
    // Write your solution here
    if(input == null){
      return input;
    }
    char[] charA = input.toCharArray();
    reverse(charA, 0, charA.length - 1);
    int start = 0;
    for (int i = 0; i < charA.length; i++){
      if(i == charA.length - 1 || charA[i+1] == ' '){
        reverse(charA, start, i);
        start = i + 2;
      }
    }
    /** or:
        for (int i = 0; i < charA.length; i++){
           if(charA[i] != ' ' && (i == 0 || charA[i-1] == ' ')){
              start = i;
           }
           if(charA[i] != ' ' && (i == charA.length - 1 || charA[i+1] == ' ')){
              reverse(charA, start, i);
           }
         }
    **/
    return new String(charA);
  }
  public void reverse(char[] charA, int left, int right){
    char temp;
    while (left < right){
      temp = charA[left];
      charA[left] = charA[right];
      charA[right] = temp;
      left++;
      right--;
    }
    return;
  }
  public void reverseWrong(char[] charA, int left, int right){
    char temp;
    for (int i = left; i <= left + (right-left)/2; i++){
      temp = charA[i];
      charA[i] = charA[right - i];
      charA[right - i] = temp;
    }
    return;
  }
}
