public class Solution {
  public int[] mergeSort(int[] array) {
    // Write your solution here
    if (array == null){
    	return array;
    }
    mergeSort(array, 0, array.length -1);
    return array;
  }
  private void mergeSort(int[] array, int left, int right){
  	if (left >= right){
    	return;
    }
    int mid = left + (right - left)/2;
    mergeSort(array, left, mid);
    mergeSort(array, mid+1, right);
    merge(array, left, mid, right);
  }
  private void merge(int[] array, int left, int mid, int right){
  	int[] helper = new int[array.length];
    for (int i = left; i <= right; i++){
    	helper[i] = array[i];
    }
    int leftIndex = left;
    int rightIndex = mid + 1;
    int cur = left; 
    while(leftIndex <= mid && rightIndex <= right){
    	if (helper[leftIndex] <= helper[rightIndex]){
      	array[cur] = helper[leftIndex];
        cur++;
        leftIndex++;
      } else {
      	array[cur] = helper[rightIndex];
        cur++;
        rightIndex++;
      }
    }
    while (leftIndex <= mid){
    	array[cur] = helper[leftIndex];
      cur++;
      leftIndex++;
    }
  }
  
}
