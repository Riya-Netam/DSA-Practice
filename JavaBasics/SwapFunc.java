//Call by Value
public class SwapFunc {
    public static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println("a = "+a+" and b = "+b);;
    }
    public static void main(String[] args) {
        int a=5;
        int b=6;
        swap(a,b);
    }
}
