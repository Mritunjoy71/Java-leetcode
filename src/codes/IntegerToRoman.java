package codes;

public class IntegerToRoman {
    public String intToRoman(int num) {
        String ans = "";
        int[] key = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 3, 2, 1};
        String[] value = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "III", "II", "I"};

        for (int i = 0; i < key.length; i++) {
            int quotient = num / key[i];
            num = num % key[i];
            while(quotient != 0){
                ans += value[i];
                quotient--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        IntegerToRoman obj = new IntegerToRoman();
        System.out.println(obj.intToRoman(1994));
    }
}
