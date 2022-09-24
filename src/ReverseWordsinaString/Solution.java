package ReverseWordsinaString;

import java.util.Arrays;
import java.util.Stack;

class Solution {
    /*public String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        Stack<String> stack = new Stack<>();
        s = s.trim();
        int n = s.length() - 1;
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i <= n; i++) {
            if (s.charAt(i) == ' ') {
                if (temp.length() > 0) {
                    stack.push(temp.toString());
                    temp = new StringBuilder();
                }

            } else
                temp.append(s.charAt(i));
        }
        if (temp.length() > 0)
            stack.push(temp.toString());

        while (!stack.isEmpty()) {
            result.append(stack.pop()).append(" ");
        }
        return result.substring(0, result.length() - 1);
    }*/

    /*public String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        s = s.trim();
        int n = s.length() - 1;
        int currentWordLen =0;
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i <= n; i++) {
            if (s.charAt(i) == ' ') {
                if (temp.length() > 0) {
                    s = s.substring(0, n + 1) + " "+ temp  + s.substring(n + 1);
                    temp = new StringBuilder();
                }

            } else{
                temp.append(s.charAt(i));
            }

        }
        if (temp.length() > 0)
            s = s.substring(0, n + 1) + temp + s.substring(n + 1);

        s = s.substring(n + 1);
        return s;
    }*/


    public String reverseWords(String s) {
        if (s == null) return null;

        char[] a = s.toCharArray();
        int n = a.length;

        // step 1. reverse the whole string
        reverse(a, 0, n - 1);
        // step 2. reverse each word
        reverseWords(a, n);
        // step 3. clean up spaces
        return cleanSpaces(a, n);
    }

    void reverseWords(char[] a, int n) {
        int i = 0, j = 0;
        while (i < n) {
            while (i < j || i < n && a[i] == ' ') i++; //skip spaces

            while (j < i || j < n && a[j] != ' ') j++;
            reverse(a, i, j - 1);
        }

    }


    private String cleanSpaces(char[] a, int n) {
        int i = 0, j = 0;
        while (j < n) {
            while (j < n && a[j] == ' ') j++;
            while (j < n && a[j] != ' ') a[i++] = a[j++];
            while (j < n && a[j] == ' ') j++;
            if (j < n) a[i++] = ' ';
        }
        return new String(a).substring(0, i);
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
        String input = "F R  I   E    N     D      S      ";
        Solution solution = new Solution();
        System.out.println("Result: " + solution.reverseWords(input));
    }

}



