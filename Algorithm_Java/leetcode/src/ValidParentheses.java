import java.util.ArrayList;
import java.util.Stack;

public class ValidParentheses {

    public boolean isValid(String s) {

        Stack stack = new Stack();
        int size = 0;
        //inputSymbol은 입력받은 문자열을 계산하기 쉽게 캐릭터 배열로 바꾼것
        char[] c = s.toCharArray();
        //스택에 넣고 빼는 반복문
        for (int i = 0; i < c.length; i++) {
            //입력받은 문자가 open문자일 경우 스택에 넣음
            switch (c[i]) {
                case '(':
                    stack.push(c[i]);
                    break;
                case '{':
                    stack.push(c[i]);
                    break;
                case '[':
                    stack.push(c[i]);
                    break;
                case ')':

                    if (!stack.isEmpty() && (char) stack.peek() == '(') {
                        stack.pop();
                    } else {
                        return false;
                    }
                    break;

                case '}':
                    if (!stack.isEmpty() && (char) stack.peek() == '{') {
                        stack.pop();
                    } else {
                        return false;
                    }
                    break;

                case ']':
                    if (!stack.isEmpty() && (char) stack.peek() == '[') {
                        stack.pop();
                    } else {
                        return false;
                    }
                    break;
            }
        }

        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub


//        int[] a = {4, 4, 4, 3, 3};
        String a = "{)";
        ValidParentheses sol = new ValidParentheses();
        System.out.println(sol.isValid(a));

    }

}
