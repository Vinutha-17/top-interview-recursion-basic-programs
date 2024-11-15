public class meanArray {
    public static int mean(int[] array, int n){

        if(n == 0) return 0;
        return array[n-1]+ mean(array, n-1);
    }

    public static void main(String[] args) {
        int array[] = {1,2,3,4,5,6,7,8};
        int n = array.length;
        int res = mean(array,n);
        double mean = (double) res/n ;
        System.out.println(mean);
    }
}
