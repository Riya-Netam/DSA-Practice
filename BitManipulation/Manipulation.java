public class Manipulation {
    public static void evenORodd(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

    public static int getIthBit(int n, int i) {
        int bitMask = 1 << i;
        if ((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int seIthBit(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }

    public static int clearIthBit(int n, int i) {
        int bitMask = 1 << i;
        return n & (~bitMask);
    }

    public static int updateIthBit(int n, int i, int newBit) {
        // if(newBit==0){
        // return clearIthBit(n, i);
        // }
        // else{
        // return(seIthBit(n, i));
        // }

        n = clearIthBit(n, i);
        int BitMask = newBit << i;
        return n | BitMask;
    }

    public static int clearIthBits(int n, int i) {
        int bitMask = (~0) << i;
        return n & bitMask;
    }

    public static int clearRangeBits(int n, int i, int j) {
        int a = (~0) << j + 1;
        int b = (1 << i) - 1;
        int bitMask = a | b;
        return n & bitMask;
    }

    public static boolean isPowerOfTwo(int n) {
        return (n & (n - 1)) == 0;
    }

    public static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) {
                count++;
            }
            n = n >> 1;
        }

        return count;

    }

    public static int fastExpo(int a, int n) {
        //a is actual number
        //n is power
        int ans = 1;

        while (n > 0) {
            if ((n & 1) != 0) { // if n is odd
                ans = ans * a;
            }

            a = a * a; // square the base
            n = n >> 1; // divide power by 2
        }

        return ans;
    }

    public static void main(String[] args) {
        // evenORodd(4);
        // evenORodd(5);

        // System.out.println(getIthBit(10, 02));
        // System.out.println(seIthBit(10, 2));
        // System.out.println(clearIthBit(10,1));

        // System.out.println(updateIthBit(10, 2, 1));

        // System.out.println(clearIthBits(15, 2));
        // System.out.println(clearRangeBits(10,2,4));

        // System.out.println(isPowerOfTwo(16));

        System.out.println(countSetBits(10));
    }
}