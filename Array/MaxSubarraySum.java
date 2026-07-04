public class MaxSubarraySum {
    public static void maxsubarray(int numbers[]) {
        int currsum=0;
        int max=Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                currsum=0;
                for (int k = i; k <= j; k++) {

                    currsum+=numbers[k];
                }
                System.out.println(currsum);
                if(max<currsum){
                    max=currsum;
                }
                
            }
            
        }
        System.out.println("Maximum sum: "+max);
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        maxsubarray(numbers);

    }
}
