/**
Given a rope with positive integer-length n, how to cut the rope into m integer-length parts with length p[0], p[1], ...,p[m-1], in order to get the maximal product of p[0]p[1] ... p[m-1]? m is determined by you and must be greater than 0 (at least one cut must be made). Return the max product you can have.

Assumptions
n >= 2

Examples
n = 12, the max product is 3 3 3 3 = 81(cut the rope into 4 pieces with length of each is 3).
**/

public class Solution {
  public int maxProduct(int length) {
    // inspired by solution
    if (length == 2){
      return 1;
    }
    int[] dp = new int[length+1];
    dp[1] = 0;
    dp[2] = 1;
    // i is the length;
    for (int i = 3; i < length+1; i++){
      //need to cut at least once; -> the shorter partition has len of j;
      // only need to check from 1 -> i/2, symmetric
      for (int j = 1; j <= i/2; j++){
        //len of other partition: i-j
        //if cut the other partition: j * dp[i-j]
        //if not cutting: j * (i-j)
        dp[i] = Math.max(dp[i], j * (Math.max(dp[i-j], i-j)));
      }
    }
    return dp[length];
  }
}
