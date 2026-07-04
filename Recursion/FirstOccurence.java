public class FirstOccurence {

    public static int getIndex(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }

        return getIndex(arr, key, i+1);

    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10,8,12};
        System.out.println(getIndex(arr, 8,0));
    }
}
