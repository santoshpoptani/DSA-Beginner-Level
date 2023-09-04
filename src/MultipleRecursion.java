public class MultipleRecursion {
    public static void main(String[] args) {
        System.out.println(fibonaci(4));
    }

    public static int fibonaci(int n ){
        /*
        * TC is 2 to the power of n
        * */
        if(n<=1)
            return n;
        int last = fibonaci(n-1);
        int slast = fibonaci(n-2);
        return last + slast;
    }
}
