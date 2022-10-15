package codes.ReverseWordsinaStringIII;

class Solution {

    public String reverseWords(String s) {
        if (s == null) return null;

        char[] a = s.toCharArray();
        int n = a.length;
        int i = 0, j = 0;
        while (i < n) {
            while (i < j || i < n && a[i] == ' ') i++; //skip spaces

            while (j < i || j < n && a[j] != ' ') j++;
            reverse(a, i, j - 1);
        }
        return new String(a);
    }



    // reverse a[] from a[i] to a[j]
    private void reverse(char[] a, int i, int j) {
        while (i < j) {
            char t = a[i];
            a[i++] = a[j];
            a[j--] = t;
        }
    }

    public static void main(String[] args) {
//        String input = "  Bob    Loves  Alice   ";
//        String input ="  the   sky    is   blue   ";
        String input = "Let's take LeetCode contest";
        Solution solution = new Solution();
        System.out.println("Result: " + solution.reverseWords(input));
    }

}



