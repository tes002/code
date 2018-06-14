public class Solution {
  Random rand = new Random();
  public int[] quickSort(int[] array) {
    // Write your solution here
    if (array == null){
    	return array;
    }
    quickSort(array, 0, array.length - 1);
    return array;
  }
  private void quickSort (int[] array, int left, int right){
  	if (right <= left){
    	return;
    }
    int index = partition(array, left, right);
    quickSort(array, left, index - 1);
    quickSort(array, index + 1, right);
  }
  private int partition (int[] array, int left, int right){ //
  	int pivotIndex = left + rand.nextInt(right - left + 1);
    int pivot = array[pivotIndex];
    swap(array, pivot, right);
    int leftBound = left;
    int rightBound = right - 1;
    while (leftBound <= rightBound){
    	if (array[leftBound] < pivot){
      	leftBound++;
      } else if (array[rightBound] < pivot){
      	swap(array, leftBound, rightBound);
        leftBound++;
        rightBound--;
      }
      if (array[rightBound] >= pivot){
      	rightBound--;
      }
    }
    swap(array, leftBound, right);
    return leftBound;
  }
  private void swap (int[] array, int a, int b){
  	int temp = array[a];
    array[a] = array[b];
    array[b] = temp;
  }
}
