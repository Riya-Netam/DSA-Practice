public class BubbleSort {

    public static void bubble(int arr[]) {
        for (int turn = 0; turn < arr.length - 1; turn++) {
            int swap=0;
            for (int j = 0; j < arr.length - turn - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap++;
                }

            }
            if(swap==0){
                System.out.println("Already Sorted");
                break;
            }

            
        }
        printArr(arr);
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        // int arr[] = { 5, 4, 1, 3, 2 };
        int arr[] = { 1,3,5,6,7 };
        bubble(arr);

    }
}