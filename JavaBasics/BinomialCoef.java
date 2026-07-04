public class BinomialCoef {

    public static int factorial(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return (f);
    }

    public static int nCr(int n, int r){
        int n_fact=factorial(n);
        int r_fact=factorial(r);
        int nmr_fact=factorial(n-r);
        int value=n_fact/(r_fact*nmr_fact);
        return value;
    }
    public static void main(String[] args) {
        System.out.println(nCr(5, 4));
    }
}
