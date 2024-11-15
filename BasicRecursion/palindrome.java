public class palindrome {

    public static boolean isPalindrome(String s){
        int n = s.length();
        if(s.equals("")) return true;
        if(s.length()==1) return true;

        return pal(s, 0, n-1);
    }

    public static boolean pal(String s, int i, int j){

        if(i==j) return true;

        if(s.charAt(i) != s.charAt(j)) return false;

        if(i<j+1) return pal(s,i+1,j-1);
        return true;
    }

    public static void main(String[] args) {

        String s = "hello world";
        String b = "a";
        System.out.println(isPalindrome(s));
        System.out.println(isPalindrome(b));
    }

    
}
