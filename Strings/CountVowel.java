import java.util.Scanner;

public class CountVowel {

    public static void vowel(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
            }
        }

        System.out.println("Count is: "+count);
    }
    public static void main(String[] args) {
        String str;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string: ");
        str=sc.nextLine();

        vowel(str);

    }
}
