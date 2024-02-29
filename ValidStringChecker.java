import java.util.Stack;

public class ValidStringChecker {
    public static boolean isValidString(String str) {
        Stack<Character> st = new Stack<>();
        char arr[] = str.toCharArray();
        for (char ch : arr) {
            if (ch == '{' || ch == '(' || ch == '[') {
                st.push(ch);
            } else if (ch == '}' && !st.isEmpty() && st.peek() == '{') {
                st.pop();
            } else if (ch == ']' && !st.isEmpty() && st.peek() == '[') {
                st.pop();
            } else if (ch == ')' && !st.isEmpty() && st.peek() == '(') {
                st.pop();
            } else {
                return false;
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        String str1 = "{([}])}";
        String str2 = "{([])}";
        System.out.println(isValidString(str1));
        System.out.println(isValidString(str2));
    }
}
