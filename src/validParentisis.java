import java.util.Stack;

public class validParentisis {

    static boolean isParenthisString(String s){
        Stack<Character> resultStack= new Stack<>();

        for (int i=0;i<s.length();i++){
       char c= s.charAt(i);
       if(isOpening(c)){
       resultStack.add(c);
       }else {
           if(s.isEmpty()){
              return false;
           }else if (!isMatching(resultStack.peek(),c)){
            return false;
           }else {
      resultStack.pop();
           }
       }

        }
    return resultStack.isEmpty();
    }

    private static boolean isMatching(Character peek, char c) {

        return (peek == '(' &&  c == ')'|| peek == '{' &&  c == '}' || peek == '[' &&  c == ']');
    }

    private static boolean isOpening(char c) {
        return (c == '(' || c == '{' || c == '[');
    }
    public static void main(String[] args) {
        String str = "(){}[]"; // Change this to test different strings
        if (isParenthisString(str)) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
}
