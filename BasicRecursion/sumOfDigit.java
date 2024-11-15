public class sumOfDigit {
    public static int Sum(int digit){
        if(digit == 0) return 0;
        if(digit == 1) return 1;
        return (digit%10)+  Sum(digit/10);
    }

    public static void main(String[] args) {
        int digit = 12345;
        System.out.println(Sum(digit));
    }
}
