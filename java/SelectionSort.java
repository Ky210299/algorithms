/**
 * SelectionSort
 */
public class SelectionSort {

  public static void main(String[] args) {
    int[] arr = {1,25,36,578,568,364,235,2345,75,45,723,1,241,2,235,457,567,34,12,12,456,};

    for(int i = 0; i<arr.length; i++) {
      int minor = i;
      for(int j = i+1; j<arr.length; j++) {
        if (arr[j] < arr[minor]) {
          int temp = arr[i];
          arr[i] = arr[minor];
          arr[minor] = temp;
        }
      }
      System.out.print("[");
      for(int e : arr) {
        System.out.print(e+",");
      }
      System.out.print("]\n");
    }
  }
}
