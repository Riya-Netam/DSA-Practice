// import java.util.Scanner;

// public class Func2 {

//     public static void calculateSum(int x,int y){
        
//         int sum=x+y;
//         System.out.println("Sum is : "+sum);
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//         calculateSum(a,b);
//     }
// }



import java.util.Scanner;

public class Func2 {

    public static int calculateSum(int x,int y){ //parameters or formal parameters
        
        int sum=x+y;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=calculateSum(a,b); //arguments or actual parameters
        System.out.println("Sum is : "+sum);
    }
}