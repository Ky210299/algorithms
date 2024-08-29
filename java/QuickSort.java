import java.util.Random;
/**
 * QuickSort
 */
public class QuickSort {

  public static void quickSort(int[] arr, int left, int right) {
    if (left >= right) {
      return;
    };
    int pi = QuickSort.partition(arr, left, right);

    quickSort(arr, left, pi-1);
    quickSort(arr, pi+1, right);
  }

  private static int partition(int[] arr, int left, int right) {
    int i = left;
    int j = right - 1;
    int pi = arr[right];

    while(i < j) {
      while(i < right && arr[i] < pi) {
        i++;
      }
      while(j > left && arr[j] >= pi) {
        j--;
      }
      if(i < j ) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
    }
    if (arr[i] > pi) {
      int temp = arr[i];
      arr[i] = pi;
      arr[right] = temp;
    }
    return i;
  }


  public static void main(String[] args) {
    int[] arr = new int[100];
    Random rand =new Random();

    for(int i = 0; i<100; i++){
      arr[i] = rand.nextInt(100);
    }
    System.out.print("Unsorted: \n[");
    for(int e : arr) {
      System.out.print(e + ",");
    }
    System.out.print("]\n");
    QuickSort.quickSort(arr, 0, arr.length - 1);

    System.out.print("Sorted: \n[");
    for(int e : arr) {
      System.out.print(e + ",");
    }
    System.out.print("]\n");
  }
}
