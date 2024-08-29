import java.util.Random;

public class MergeSort {

  public static String toString(int[] arr, String title) {
    String a = title + ": \n[";
    String body ="";
    String c = "]";
    for(int e : arr) {
      body += e + ",";
    }
    return a + body + c;
  }

  public static void mergeSort(int[] array) {
    int arrLength = array.length;
    if (arrLength < 2){
      return;
    }
    int middle = arrLength / 2;

    int[] ls = new int[middle];
    int[] rs = new int[arrLength - middle];

    for(int i = 0; i<middle; i++) {
      ls[i] = array[i];
    }
    for(int i = middle; i<arrLength; i++) {
      rs[i - middle] = array[i];
    }
    mergeSort(ls);
    mergeSort(rs);
    
    // Merge

     MergeSort.merge(array, ls, rs);

  };
  private static void merge(int[] arr, int[] ls, int[] rs ){
    int lsSize = ls.length;
    int rsSize = rs.length;
    int i = 0, j = 0, k = 0;

    while(i < lsSize &&  j < rsSize) {
      if(ls[i] < rs[j]) {
        arr[k] = ls[i];
        i++;
      } else {
        arr[k] = rs[j];
        j++;
      }
      k++;
    }
    while (i < lsSize) {
        arr[k] = ls[i];
        i++;
        k++;
    }
    while (j < rsSize) {
        arr[k] = rs[j];
        j++;
        k++;
    }
  };

  public static void main(String[] args) {

    int[] arr = new int[100];
    Random rand =new Random();

    for(int i = 0; i<100; i++){
      arr[i] = rand.nextInt(100);
  }
    System.out.println(MergeSort.toString(arr, "Before"));
    MergeSort.mergeSort(arr);
    System.out.println(MergeSort.toString(arr, "After"));
  }
}
