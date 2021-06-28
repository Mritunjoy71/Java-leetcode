import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<String >();
        backTrack(ans, "",0, 0, n);
        return ans;
    }

    public void backTrack(List<String> ans, String cur_string, int open, int close, int max) {
        if (cur_string.length() == 2*max) {
            ans.add(cur_string);
        }
        if (open < max) {
            backTrack(ans, cur_string+"(",open+1,close, max);
        }
        if (close < open) {
            backTrack(ans, cur_string+")", open,close+1, max);
        }
    }

    public static void main(String[] args) {
        GenerateParentheses obj = new GenerateParentheses();
        System.out.println(obj.generateParenthesis(3));
    }
}
