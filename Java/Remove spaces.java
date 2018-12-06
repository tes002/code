//Remove leading/trailng spaces, and duplicate spaces between words (only keep one)

public class Solution {
  public String removeSpaces(String input) {
    if (input == null || input.length() == 0){
      return "";
    }
    char[] array = input.toCharArray();
    int i = 0;
    int j = 0;
    // left of i: finished; j -> explore
    for(; j < array.length; j++){
      if(j == 0 && array[j] == ' ') {
        continue;
      }
      if(array[j] != ' ' || (array[j] == ' ' && array[j-1] != ' ')){
        array[i++] = array[j];
      } else {
        continue;
      }
    }
    //or:
   /**
     for(; j < array.length; j++){
       if(array[j] == ' ' && (j == 0 || array[j-1] == ' ')){
         continue;
       }
       array[i++] = array[j];
     }
   **/
    if(array[j - 1] == ' '){
      i--;
    }
    //in case there are only spaces in char[]; i -> -1;
    i = Math.max(0, i);
    return new String(array, 0, i);
  }
}
