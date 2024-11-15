public class minMax {
    
    public static int min(int[] a, int n) {
        if(n == 1) return a[0];

        return Math.min(a[n-1],min(a,n-1));
    }
    public static int max(int[] a, int n) {
        if(n == 1) return a[0];

        return Math.max(a[n-1], max(a, n-1));
    }

    public static void main(String[] args){

        int[] a = {1,2,3,4,5,6,7,8,9};
        int n = a.length ;
        int minResult = min(a, n);
        int maxResult = max(a, n);
        System.out.println(minResult);
        System.out.println(maxResult);
    }
}
