// Similar to longest consecutive 1's, plus Set / HashSet operation

public class Solution {
  public int longest(String input) {
    // Write your solution here
    Set<Character> distinct = new HashSet<>();
    int left = 0, right = 0, globalLongest = 0; //there is a window between left and right; store the length of longest window ever.
    while (right < input.length()){
      char end = input.charAt(right);
    	if (distinct.contains(end)){
        char start = input.charAt(left);
      	distinct.remove(start);
        left++;
      } else {
      	distinct.add(end);
        right++;
        globalLongest = Math.max(globalLongest, right - left);
      }
    }
    return globalLongest;
  }
}
