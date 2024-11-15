public class reverseString {
    public static String StrRev(String s, int n){

        if(n < 1) return "";

        if( n == 1) 
            return String.valueOf(s.charAt(0));

        return s.charAt(n-1) + StrRev(s, n-1);

    }

    public static void main(String[] args)
    {
        String str = "hello world";
        int n = str.length();
        System.out.println(StrRev(str, n));
    }
}
