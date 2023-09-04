public class Patterns {
    public static void main(String[] args) {
        pattern11(5);
    }

    public static void pattern1(int n) {
        /*
         * *****
         * *****
         * *****
         * *****
         * *****
         * */

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern2(int n) {
        /*
         * *
         * **
         * ***
         * ****
         * *****
         * */
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern3(int n) {
        /*
         * 1
         * 12
         * 123
         * 1234
         * 12345
         * */
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void pattern4(int n) {
        /*
         * 1
         * 22
         * 333
         * 4444
         * 5555
         * */
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void pattern5(int n) {
        /*

         *****
         ****
         ***
         **
         *

         */
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern6(int n) {
        /*

         1234
         123
         12
         1

         */
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void pattern7(int n) {
        /*
         *
         *
         ***
         *****
         *******
         *********
         */
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void pattern8(int n) {
        /*
         *********
         *******
         *****
         ***
         *
         */
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2 * n - (2 * i + 1); j++) {
                System.out.print("*");
            }

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void pattern10(int n) {
        /*
         *
         **
         ***
         ****
         *****
         ****
         ***
         **
         *

         * */
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void pattern10s2(int n) {
        /*
         *
         **
         ***
         ****
         *****
         ****
         ***
         **
         *

         * */
        for(int i = 0 ;i <2*n; i++){
            int row = i>5?2*n-i:i;
            for(int j = 0;j<row; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern11(int n){
        int start = 1;
        for(int i = 0 ; i<=n ; i++)
        {
            if(i%2==0) start=1;
            else start = 0;
            for(int j = 0 ; j<=i;j++){
                System.out.print(start);
                start = 1- start;
            }
            System.out.println();
        }
    }
}
