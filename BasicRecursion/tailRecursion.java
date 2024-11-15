public class tailRecursion {
    public static int tail(int[] array, int n, int sum){

        if(n <= 0) return sum;
        return (tail(array, n-1, sum+array[n-1]));
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4};
        int n = array.length;
        int sum = 0;
        int res = tail(array, n, sum);
        System.out.println(res);
    }
}
