public class reverseFibonacci {
    
    public static void fib(int n, int a,int b){

        if(n>0){
            fib(n-1,b,a+b);
            System.out.println(a);
        }
    }

    public static void main(String[] args)
    {
        int n = 7;
        fib(n, 0 , 1);
    }
}
