public class Solution {
  public String[] topKFrequent(String[] combo, int k) {
    // Write your solution here
    //1.cnt the freq using hashmap
    //2.min heap with a size of k

    Map<String, Integer> cnt = new HashMap<>();
    for (int i = 0; i < combo.length; i++){
      int curCnt = cnt.containsKey(combo[i])? cnt.get(combo[i]) : 0;
      cnt.put(combo[i], curCnt + 1);
    }
    //implment 2.Min heap on the frequencies:
    //use Map.entry as the element type directly -> most efficient
    PriorityQueue<Map.Entry<String,Integer>> minHeap = new PriorityQueue<>(k,
    new Comparator<Map.Entry<String,Integer>>(){
    @Override
      public int compare(Map.Entry<String,Integer> e1, Map.Entry<String,Integer> e2){
        return e1.getValue().compareTo(e2.getValue());
      }
    });
    for(Map.Entry<String, Integer> entry : cnt.entrySet()){
      // put entire entry into minHeap
      if(minHeap.size() < k){
        minHeap.offer(entry);
      } else {
        int val = entry.getValue();
        if ( val > minHeap.peek().getValue()){
          minHeap.poll();
          minHeap.offer(entry);
        }
      }
    }
    //sorted by freq
    //if minHeap.size() < k; could not use String[k] here
    String[] res = new String[minHeap.size()];
    for (int i = minHeap.size() - 1; i >= 0; i--){
      res[i] = minHeap.poll().getKey();
    }
    return res;
  }
}
