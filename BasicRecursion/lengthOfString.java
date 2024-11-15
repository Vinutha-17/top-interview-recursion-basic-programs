public class lengthOfString {
    public static int len(String str) {
        if(str.equals("")) return 0;

        return len(str.substring(1))+1;
    }

    public static void main(String[] args){
        String str = "hello world";
        System.out.println(len(str));
    }
}
