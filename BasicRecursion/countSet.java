public class countSet {
    public static int count(int n){

        if(n==0) return 0;

        if((n &1) == 1)
            return 1+count(n>>1);
        else
            return count(n>>1);
    }

    public static void main(String[] args)
    {
        int n = 21;
        int res = count(n);
        System.out.println(res);
    }
}
