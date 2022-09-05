package ValidParentheses;

public class ValidParentheses {
    public static boolean validParentheses(String parens) {
        parens = parens.replaceAll("[^\\(\\)]", "");
        while (parens.contains("()")) {
            parens = parens.replaceAll("\\(\\)", "");
        }
        return (parens.length() == 0) ? true : false;
    }

    public static void main(String[] args) {
        System.out.println(validParentheses("()(a;scjs)(as;kmx(qaw;))"));
    }
}
