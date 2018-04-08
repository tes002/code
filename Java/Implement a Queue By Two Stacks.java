public class Solution {
  LinkedList<Integer> stackIn;
  LinkedList<Integer> stackOut;
  public Solution() {
    // Write your solution here.
    stackIn = new LinkedList<Integer>();
    stackOut = new LinkedList<Integer>();
  }
  /**private void move(){
  	*if(stackOut.isEmpty()){
    	while(!stackIn.isEmpty()) {
    		stackOut.push(stackIn.pop());
      }
    }
  }*/
  public Integer poll() {
    if(!stackOut.isEmpty()){
    	return stackOut.pop();
    } else if(stackIn.isEmpty()){
    	return null;
    } else {   // could use move() here
      while(!stackIn.isEmpty()) {
    		stackOut.push(stackIn.pop());
      }
      return stackOut.pop();
  	}
  }
  
  public void offer(int element) {
    stackIn.push(element);
  }
  
  public Integer peek() {
    if(!stackOut.isEmpty()){
    	return stackOut.peek();
    } else { // could use move() here
    	while(!stackIn.isEmpty()) {
    		stackOut.push(stackIn.pop());
      }
      return stackOut.peek();
    }
  }
  
  public int size() {
    return stackIn.size() + stackOut.size();
  }
  
  public boolean isEmpty() {
    if (stackIn.isEmpty() && stackOut.isEmpty()) {
    	return true;
    } else{
    return false;
    }
  }
}
