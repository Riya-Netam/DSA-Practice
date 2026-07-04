import java.util.Scanner;

public class Recursion {

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            
        }
        System.out.println();
    }

    public static void recursion(int arr[], int i,int value) {
        if (i == arr.length) {
            printArr(arr);
            return;
        }
        arr[i] = value;
        recursion(arr, i+1,value+1);
        arr[i]=arr[i]-2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        recursion(arr, 0,1);
        printArr(arr);
    }

}