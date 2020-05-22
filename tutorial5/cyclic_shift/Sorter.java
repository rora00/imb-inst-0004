package tutorial5.cyclic_shift;

public class Sorter {
  public static void selectionSort(int[] array) {
    for(int i = 0; i < (array.length - 1); i++) {
      int nextMinAt = findPositionOfMin(array, i);
      if (i != nextMinAt) {
        swap(array, i, nextMinAt);
      }
    }
  }

  private static int findPositionOfMin(int[] array, int from) {
    int minVal = array[from];
    int minValPos = from;
    for (int i = from+1; i < array.length; i++) {
      if (array[i] < minVal) {
        minVal = array[i];
        minValPos = i;
      }
    }
    return minValPos;
  }

  private static void swap(int[] array, int i, int j) {
    int temp = array[i];
    array[i] = array[j];
    array[j] = temp;
  }

  private static void cyclicShift(int[] array){
    for(int i = 0; i < array.length-1; i++){
      array[i] = array[i+1];
    }
    array[array.length-1] = array[0];
  }
}
