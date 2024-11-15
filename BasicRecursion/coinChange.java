public class coinChange {

    public static int coin(int[] coins, int n, int sum)
    {
        if(sum == 0) return 1;
        if(n<=0 || sum<0) return 0;
        return coin(coins, n-1, sum) + coin(coins, n, sum-coins[n-1]);
    }

    public static void main(String[] args) {
        int[] coins = {1,2,3};
        int sum = 4;
        int n = coins.length;
        System.out.println(coin(coins,n,sum));
    }
}
