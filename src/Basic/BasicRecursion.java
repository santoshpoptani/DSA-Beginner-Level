package Basic;

public class BasicRecursion {
    int count =0;
    public static void main(String[] args) {
       BasicRecursion basicRecursion = new BasicRecursion();

       //basicRecursion.f1();
        //basicRecursion.printname(0,4);
        //basicRecursion.printnumbers(1,10);
        //basicRecursion.printnumberNto1(10);
        //basicRecursion.number1toNbacktracking(5);
        basicRecursion.numberNto1Backtracking(1,5);
    }

    public void f1(){

        if(count==4)
            return;

        System.out.println(count);
        count++;
        f1();
    }

    public void printname(int i, int n ){
        /*
        *
        * Time Complexity is O(n)
        * Space Complexity is O(n)
        * */
        if(i>n){
            return;
        }
        System.out.println("Santosh");
        printname(i+1,n);
    }

    public void printnumbers(int i , int n ){
        if(i>n){
            return;
        }
        System.out.println(i);
        printnumbers(i+1,n);
    }

    public void printnumberNto1(int i ){
        if(i<1){
            return;
        }
        System.out.println(i);
        printnumberNto1(i-1);
    }
    public void number1toNbacktracking(int i ){
        if(i<1)
            return;
        number1toNbacktracking(i-1);
        System.out.println(i);
    }

    public void numberNto1Backtracking(int i , int n){
        if(i>n)
            return;
        numberNto1Backtracking(i+1,n);
        System.out.println(i);
    }
}
