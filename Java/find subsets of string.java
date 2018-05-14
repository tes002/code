public class Solution {
  public List<String> subSets(String set) {
    // Write your solution here.
    List<String> res = new ArrayList<>();
    if (set == null) {
    	return res;
    }
    StringBuilder word = new StringBuilder();
    char[] charArray = set.toCharArray();
    findSubset(charArray, word, 0, res);
    return res;
  }
  private void findSubset(char[] charArray, StringBuilder word, int index, List<String> res){
  	if (index == charArray.length){
    	res.add(word.toString());
      return;
    }
    //using this element
    word.append(charArray[index]);
    findSubset(charArray, word, index + 1, res);
    word.deleteCharAt(word.length() - 1);
    // not using this element
    findSubset(charArray, word, index + 1, res);
  }
}
