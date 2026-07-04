import java.util.*;

public class SumOfNaturalNum{

    public static int sumOfN(int n){
        if(n==1){
            return 1;
        }
        int nm1=sumOfN(n-1);
        int sum=n+nm1;

        return sum;

    }
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        n=sc.nextInt();
        System.out.println(sumOfN(n));
        
    }
}