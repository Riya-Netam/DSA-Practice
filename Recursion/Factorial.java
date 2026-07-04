import java.util.Scanner;

public class Factorial {

    public static int fact(int n){

        if(n==0){
            return 1;
        }
        int fNm1=fact(n-1);
        int fn=n*fNm1;
        return fn;
    }
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        n=sc.nextInt();
        System.out.print(fact(n));

    }
}
