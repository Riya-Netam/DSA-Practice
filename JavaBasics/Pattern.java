public class Pattern {

    public static void hollow_rectangle(int row, int col) {

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if (i == 1 || i == row || j == 1 || j == col) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }

    public static void inverted_rotated_half_pyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void invertedHalfPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j);
            }
            // for(int j=1;j<=i-1;j++){
            // System.out.print(" ");
            // }
            System.out.println();
        }
    }

    public static void floyds_Triangle(int n) {
        int num = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                num = num + 1;
                System.out.print(num + " ");
            }

            System.out.println();
        }
    }

    public static void zero_one_triangle(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }

            }
            System.out.println();
        }
    }

    public static void butterfly(int n) {
        // FIRST HALF
        for (int i = 1; i <= n; i++) {
            // stars---i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // spaces---2*(n-i)
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // stars--i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // SECOND HALF
        for (int i = n; i >= 1; i--) {
            // stars---i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // spaces---2*(n-i)
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // stars--i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void solid_rhombus(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    // public static void hollow_rhombus(int n){
    // for(int i=1;i<=n;i++){
    // for(int j=1;j<=n-i;j++){
    // System.out.print(" ");
    // }
    // if(i==1 || i==n){
    // for(int j=1;j<=n;j++){
    // System.out.print("*");
    // }
    // }
    // else{
    // System.out.print("*");
    // for(int j=1;j<=n-2;j++){
    // System.out.print(" ");
    // }
    // System.out.print("*");
    // }
    // System.out.println();
    // }
    // }

    public static void hollow_rhombus(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }

            System.out.println();
        }
    }

    public static void diamond_pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        // hollow_rectangle(10, 10);
        // inverted_rotated_half_pyramid(5);
        // invertedHalfPyramid(10);
        // floyds_Triangle(5);
        // zero_one_triangle(5);
        // butterfly(4);
        // solid_rhombus(5);
        // hollow_rhombus(7);
        diamond_pattern(4);
    }
}
