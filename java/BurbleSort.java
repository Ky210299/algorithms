public class BurbleSort {
  public static void main(String[] args) {
    int[] arr = {2,42,63,36,73,15,37,58,14,63,61,27,82,35,31};
    for(int i = 0; i < arr.length; i++){
      for (int j = 0; j < (arr.length - i - 1); j++){
        if (arr[j+1] < arr[j]) {
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
      }
      System.out.print("[");
      for(int e:arr) {
      System.out.print(e + ",");
      }
      System.out.print("]\n");
    }
  }
}
