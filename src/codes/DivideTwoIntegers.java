package codes;

public class DivideTwoIntegers {
    public int divide(int dividend, int divisor) {
        if(dividend==Integer.MIN_VALUE && divisor==-1)
            return Integer.MAX_VALUE;
        long quotient = 0;
        long temp_divisor = Math.abs((long)divisor);
        long temp_dividend = Math.abs((long) dividend);
        long temp =0 ;
        for (int i = 31;i>=0;i--){
            if (temp+(temp_divisor<<i)<=temp_dividend){
                temp += temp_divisor<<i;
                quotient |= 1L<<i;
            }
        }
        return (int)quotient*Integer.signum(dividend)*Integer.signum(divisor);
    }

    public static void main(String[] args) {
//        -2147483648
//                -1
        DivideTwoIntegers dti = new DivideTwoIntegers();
        System.out.println(dti.divide(-2147483648,-3));
    }
}
