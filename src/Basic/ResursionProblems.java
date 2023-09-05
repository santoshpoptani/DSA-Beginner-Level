package Basic;

public class ResursionProblems {
    public static void main(String[] args) {

        System.out.println(factorial(1));

    }

    public static void additionofNnumbers(int i , int sum){
/*
* Parameter recursion
* not returning anything just printing value
*
* */
        if(i<1){
            System.out.println(sum);
            return;
        }
        additionofNnumbers(i-1, sum+i);

    }

    public static  int additionofNnumberssol2(int n ){
        /*
        * Function patrern recursion
        * Where recursive function will return something;
        * */
        if(n==0){
            return 0;
        }
        return n + additionofNnumberssol2(n-1);
    }

    public static int factorial(int n ){
        /*
        *
        * Factorial of number using function recursion
        * */
        if(n==1)
            return 1;
        return n *factorial(n-1);
    }
}
