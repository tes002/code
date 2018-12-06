public class Solution {
  public String remove(String input, String t) {
    // Write your solution here
    if(input.length() == 0 || t == null || t.length() == 0){
      return input;
    }
    char[] inputA = input.toCharArray();
    Set<Character> set = new HashSet<>();
    for(int i =0; i < t.length(); i++){
      set.add(t.charAt(i));
    }
    int i = 0;
    int j = 0;
    for(; j < input.length(); j++){
      if(!set.contains(inputA[j])){
        inputA[i++] = inputA[j];
      }
    }
    //or:
    /**while(i < input.length() && j < input.length()){
      if(set.contains(inputA[j])){
        while(j < input.length() && set.contains(inputA[j])){
          j++;
        }
      }
      if(j == input.length()){
        return new String(inputA, 0, i);
      }
          inputA[i++] = inputA[j++];
    }
     **/
     return new String(inputA, 0, i);
  }
}
