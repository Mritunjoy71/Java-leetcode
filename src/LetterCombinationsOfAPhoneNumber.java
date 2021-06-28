import java.util.LinkedList;
import java.util.List;

public class LetterCombinationsOfAPhoneNumber {
    public List<String> letterCombinations(String digits) {
        LinkedList<String> combination = new LinkedList<String>();
        if (digits.length() == 0)
            return combination;
        String[] mappings = new String[] {"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        combination.add("");
        while (combination.peek().length() != digits.length()) {
            String remove = combination.remove();
            String map = mappings[digits.charAt(remove.length())-'0'];
            for (char c:map.toCharArray()){
                combination.addLast(remove+c);
            }
        }
        return combination;
    }

    public static void main(String[] args) {
        String s ="";
        LetterCombinationsOfAPhoneNumber c = new LetterCombinationsOfAPhoneNumber();
        System.out.println(c.letterCombinations(s));
    }
}
