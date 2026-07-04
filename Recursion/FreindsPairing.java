public class FreindsPairing {

    public static int pairing(int n){
        if(n==1||n==2){
            return n;
        }

        int fnm1=pairing(n-1);

        int fnm2=pairing(n-2);
        int pairWays=(n-1)*fnm2;

        int totWays=fnm1+pairWays;
        return totWays;
    }
    public static void main(String[] args) {
        System.out.print(pairing(3));
    }
}
