import java.util.*;

public class Palindrome {

    public static boolean checkPalindrome(String str){
        int n=str.length();
        for(int i=0; i<n/2;i++){
            if(str.charAt(i)!=str.charAt(n-1-i)){
                System.out.println("Not Plaindrome");
                return false;
            }
        }

        return true;

        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str;
        System.out.print("Enter string: ");
        str=sc.nextLine();

       System.out.println(checkPalindrome(str)); 
    }
}
