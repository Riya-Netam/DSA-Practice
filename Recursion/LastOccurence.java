public class LastOccurence {

    public static int getInd(int arr[],int key,int i){

        if(i==arr.length){
            return -1;
        }
        int isFound =getInd(arr, key, i+1);
        if(isFound==-1 && arr[i]==key){
            return i;
        }

        return isFound;
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10,8,12};
        System.out.println(getInd(arr, 8, 0));

    }
}
