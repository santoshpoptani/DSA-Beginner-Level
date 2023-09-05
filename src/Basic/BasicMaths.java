package Basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BasicMaths {
    public static void main(String[] args) {
        gcd(20,5);
    }

    public static void countDigits(int n) {
        int count = 0;
        while (n > 0) {
            n = n / 10;
            count++;
        }
        System.out.println(count);

    }

    public static void reversethenumber(int n) {
        int rev = 0;
        int rem = 0;
        while (n > 0) {
            rem = n % 10;
            rev = (rev * 10) + rem;
            n = n / 10;
        }
        System.out.println(rev);
    }

    public static void palindromeofnumber(int n) {
        int dup = n;
        int rev = 0;
        while (dup > 0) {
            int rem = dup % 10;
            rev = (rev * 10) + rem;
            dup = dup / 10;
        }
        boolean result = rev == n ? true : false;
        System.out.println(result);
    }

    public static void isArmstrong(int n) {
        int dup = n;
        int sum = 0;
        while (dup > 0) {
            int rem = dup % 10;
            sum = sum + (rem * rem * rem * rem);
            dup = dup / 10;
        }
        boolean result = sum == n ? true : false;
        System.out.println(result);
    }

    public static void findAllDivisors(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void findAllDivisorssol2(int n) {
        List<Integer> div = new ArrayList<>();
        for (int i = 1; i * i < n; i++) {
            if (n % i == 0) {
                div.add(i);
                /*
                 * 36/i
                 * i.e
                 * 36/2 -> 18
                 * 36/3 -> 13
                 * 36/4 -> 9
                 *
                 * */
                if ((n / i) != i) {
                    div.add(n / i);
                }
            }
        }
        Collections.sort(div);
        for (Integer i : div) {
            System.out.print(i + " ");
        }
    }

    public static void findprimebruteforce(int n) {
        /*
            time complxity is O(n)
        *
        * */
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println(true);
        } else {
            System.out.println(false);

        }
    }

    public static void findprimeSquarerootSol(int n) {
        int count = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                count++;
                if ((n / i) != i) {
                    count++;
                }
            }
        }
        if (count == 2) {
            System.out.println(true);
        } else {
            System.out.println(false);

        }
    }

    public static void gcd(int a, int b) {
        /*
        * time Complexity of this algo is log phie(min(n1,n2)
        * */
        while (a > 0 && b > 0) {
            if (a > b)
                a = a % b;
            else
                b = b % a;

            if(a==0)
                System.out.println(b);
            else
                System.out.println(a);
        }
    }

}
