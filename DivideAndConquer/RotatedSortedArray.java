public class RotatedSortedArray {

    public static int search(int arr[],int si,int ei,int target){
        if(si>ei){
            return -1;
        }
        
        int mid=si+(ei-si)/2;

        //case FOUND
        if(arr[mid]==target){
            return mid;
        }

        //mid on L1
        if(arr[si]<=arr[mid]){
            //case a: left
            if(arr[si]<=target && target<=arr[mid]){
                return search(arr, si, mid-1, target);
            }else{
                //case b:right
                return search(arr, mid+1, ei, target);
            }
        }

        // mid on L2
        else{
            //case c: right
            if(arr[mid]<=target && target<=ei){
                return search(arr, mid+1, ei, target);
            }
            else{
                //case d: left
                return search(arr, si, mid-1, target);
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        System.out.println(search(arr, 0, arr.length-1, 0));
}
}
