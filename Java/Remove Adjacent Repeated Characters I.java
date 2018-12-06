public class Solution {
  public String deDup(String input) {
    if(input == null || input.length() <= 1){
      return input;
    }
    char[] array = input.toCharArray();
    int i = 1;
    for (int j = 1; j < array.length; j++){
      if(array[j] != array[j-1]){
        array[i++] = array[j];
      }
    }
    return new String(array, 0, i);
  }
}
