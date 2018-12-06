public class Solution {
  public String deDup(String input) {
    // Use Stack: actual one(extra space) or in-place 'stack';
    if (input == null || input.length() <= 1){
      return input;
    }
    Deque<Character> stack = new LinkedList<>();
    char[] a = input.toCharArray();
    int i = 1;
    stack.offerFirst(a[0]);
    while(i < a.length){
      if(stack.isEmpty() || a[i] != stack.peekFirst()){
        stack.offerFirst(a[i]);
        i++;
      } else {
        //put i < len first, to avoid index out of bound
        while(i < a.length && a[i] == stack.peekFirst()){
          i++;
        }
        stack.pollFirst();
      }
    }
    //why doesn't work?
    /**
    i = a.length - 1;
    while(!stack.isEmpty()){
      a[i] = stack.pollFirst();
      i--;
    }
    return new String(a, i+1, a.length);
    **/
    char[] res = new char[stack.size()];
    for (int j = res.length - 1; j >= 0; j--){
      res[j] = stack.pollFirst();
    }
    return new String(res);
  }
}
