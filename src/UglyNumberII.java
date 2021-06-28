import java.util.*;

public class UglyNumberII {
    public int nthUglyNumberFirst(int n) {
        if (n ==1 ) return 1;
        int[] ugly = new int[n];
        int next_ugly_number = 1;
        ugly[0] = next_ugly_number;
        int i2 = 0, i3 = 0, i5 = 0;
        int ugly2 = 2, ugly3 = 3, ugly5 = 5;
        for (int i = 1; i < n; i++) {
            next_ugly_number = Math.min(ugly2,Math.min( ugly3, ugly5));
            ugly[i] = next_ugly_number;
            if (next_ugly_number == ugly2){
                i2++;
                ugly2 = ugly[i2]*2;
            }
            if (next_ugly_number == ugly3){
                i3++;
                ugly3 = ugly[i3]*3;
            }
            if (next_ugly_number == ugly5){
                i5++;
                ugly5 = ugly[i5]*5;
            }
        }
        return next_ugly_number;
    }

    public int nthUglyNumber(int n) {
        TreeSet<Integer> ts = new TreeSet<Integer>();
        ts.add(1);
        int i =1;
        while (i<n) {
            Integer temp = ts.pollFirst();
            ts.add(temp*2);
            ts.add(temp*3);
            ts.add(temp*5);
            i++;
        }

        return ts.pollFirst();
    }

    public static void main(String[] args) {
        UglyNumberII obj = new UglyNumberII();
        System.out.println(obj.nthUglyNumber(1407));
    }
}
