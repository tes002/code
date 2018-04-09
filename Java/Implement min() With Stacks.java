public class Solution {
  Deque<Integer> stack;
  Deque<Integer> min;
  public Solution() {
    // write your solution here
    stack = new LinkedList<>();
    min = new LinkedList<>();
  }
  
  public Integer pop() {
    if(stack.isEmpty()){
    	return null;
    }
    Integer t = stack.pop();
    if (t.equals(min.peek())){
    	min.pop();
    }
    return t;
  }
  
  public void push(int element) {
    stack.push(element);
    if (min.isEmpty() || element <= min.peek()){
    	min.push(element);
    }
  }
  
  public Integer top() {
    if (stack.isEmpty()) return null;
    return stack.peek();
  }
  
  public Integer min() {
    if (min.isEmpty()) return null;
    return min.peek();
  }
}
