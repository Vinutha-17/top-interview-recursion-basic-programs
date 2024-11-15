public class decimalToBinary {
    public static int getBinary(int decimal){
        if(decimal <= 0) 
        return 0;
        else
        return (decimal % 2) + 10 * getBinary(decimal/2);
    }

    public static void main(String[] args){

        int decimal = 7;
        int res = getBinary(decimal);
        System.out.println(res);
    }
}
