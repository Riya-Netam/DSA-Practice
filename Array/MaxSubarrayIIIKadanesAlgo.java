public class MaxSubarrayIIIKadanesAlgo {

    public static void maxSubarray(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int maxValue = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {

            currSum += numbers[i];
            if (currSum < 0) {
                currSum = 0;
            }
            if (currSum > maxSum) {
                maxSum = currSum;
            }

            if (numbers[i] > maxValue) {
                maxValue = numbers[i];
            }

        }
        if (maxSum == 0) {
            System.out.println("All numbers are negative so.. : " + maxValue);
        }

        System.out.println("Max subarray sum: " + maxSum);
    }

    public static void main(String[] args) {
        // int numbers[]={-2,-3,4,-1,-2,1,5,-3};
        int numbers[] = { -2, -3, -4, -1, -2, -1, -5, -3 };
        maxSubarray(numbers);
    }
}
