public class Solution {
  public int strstr(String large, String small) {
    if(small == null || small.length() < 1){
      return 0;
    }
    char[] input = large.toCharArray();
    char[] p = small.toCharArray();
    boolean match = false;
    for(int i = 0; i < input.length; i++){
      if(input[i] == p[0]){
        int j = i;
        for(; j < i + p.length; j++){
          //test case for j > input.length - 1: ["bcabc","bcd"]
          // j + p.len might be longer than input len.
          // or: bound: i < input.length - p.length
          if(j > input.length - 1|| input[j] != p[j-i]){
            break;
          }
        }
        if (j == i + p.length){
          return i;
        }
      }
    }
    return -1;
  }
}


//Or: RabinKarp: hash + sliding window
