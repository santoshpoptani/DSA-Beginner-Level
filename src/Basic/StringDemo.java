package Basic;

public class StringDemo {
    public static void main(String[] args) {
        System.out.println(isPalindromerecursion(0,"MADAM"));
    }

    public static boolean isPalindrome(String s){
        for(int i = 0; i<s.length()/2; i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1)){
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindromerecursion(int i , String s){
        if(i>s.length()/2){
            return true;
        }
        if(s.charAt(i)!=s.charAt(s.length()-i-1)){
            return false;
        }
        return isPalindromerecursion(i+1,s);
    }
}
