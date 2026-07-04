import java.util.Arrays;
import java.util.Collections;

public class InbuiltSort {

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[]={5,3,6,2,3};
        // Arrays.sort(arr);
        // Arrays.sort(arr,0,3);

        //sorting in descending order
        

        printArr(arr);
    }
}
