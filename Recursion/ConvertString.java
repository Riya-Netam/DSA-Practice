public class ConvertString {
    static String digits[]={"zero","one","two","three","four","five","six","seven","eight","nine","ten"};

    public static void numToString(int number){
        
        if(number==0){
            return;
        }

        int lastDigit=number%10;
        numToString(number/10);
        System.out.print(digits[lastDigit]+" ");
    }
    public static void main(String[] args) {
        numToString(1234);
    }
}
