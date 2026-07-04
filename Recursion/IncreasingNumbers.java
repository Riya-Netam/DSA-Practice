import java.util.Scanner;

public class IncreasingNumbers {

    public static void printinc(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        } 

        printinc(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        n=sc.nextInt();

        printinc(n);

    }
}
