public class LargestNum {

    public static int getLargest(int number[]){
        int largest=Integer.MIN_VALUE;
        int smallest= Integer.MAX_VALUE;

        for(int i=1;i<number.length;i++){
            if(number[i]>largest){
                largest=number[i];

            }
        }

        for(int i=1;i<number.length;i++){
            if(number[i]<smallest){
                smallest=number[i];

            }
        }
        System.out.println("Smallest : "+smallest);

        return largest;
    }
    public static void main(String[] args) {
        int number []={2,5,6,20,1,3,9};
        System.out.println("Largest number is : "+getLargest(number));
        

    }
}
