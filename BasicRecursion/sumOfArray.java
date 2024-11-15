public class sumOfArray {
    public static int Sum(int[] array, int n){
        if(n <= 0) return 0;
        return array[n-1]+ Sum(array, n-1);
    }

    public static void main(String[] args) {
        int array[] = {0,1,2,3,4,5,6};
        int n = array.length;
        int res = Sum(array, n);
        System.out.println(res);
    }
}
