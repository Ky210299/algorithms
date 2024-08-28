public class InsertionSort {
  public static void main(String[] args) {
    int[] arr = {2,6,7,2,4,56,7,8,9,7,8,95,65,25,15,3,12,4,6,8,9645,623,12,1235,345678,7,5,12};

    for (int i = 0; i<arr.length; i++) {
      int current = arr[i];
      int j = i-1;

      while(j > 0 && arr[j] > current) {
        arr[j+1] = arr[j];
        j--;
      }
      arr[j+1] = current;

      System.out.print("[");
      for(int e : arr) {
        System.out.print( e + ",");
      }
      System.out.print("]\n");
    }
  }
}
