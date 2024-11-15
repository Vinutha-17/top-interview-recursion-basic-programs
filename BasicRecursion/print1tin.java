public class print1tin {
    public static void printN(int n){
        if(n >0)
        {
            printN(n-1);
            System.out.println(n);
        }
        //return;
    }

    public static void main(String[] args) {
        int n = 5;
        printN(n);
    }
}
