import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Tower {
    public static void main(String[] args) {
//        int[] numbers = new int[]{6, 9, 5, 7, 4};
//        int[] numbers = new int[]{3, 9, 9, 3, 5, 7, 2};
        int[] numbers = new int[]{1, 5, 3, 6, 7, 6, 5};


        Tower sol = new Tower();
        System.out.print("sol = " + sol.solution(numbers));

    }

    public int[] solution(int[] heights) {
        int[] answer = new int[heights.length];
        Stack<Integer> stack = new Stack();
        Stack<Integer> resultStack = new Stack();
        boolean check = false;

        for (int i = 0; i < heights.length; i++) {
            stack.push(heights[i]);
        }

        while (!stack.isEmpty()) {
            for (int i = 0; i < stack.size(); i++) {
                if (stack.get(stack.size() - i - 1) > stack.peek()) {
                    resultStack.push(stack.size() - i);
                    check = true;
                    break;
                } else {
                    check = false;
                }
            }
            if (check) {
                stack.pop();
            } else {
                resultStack.push(0);
                stack.pop();
                check = false;
            }
        }

        for (int i = 0; i < answer.length; i++) {
            answer[i] = resultStack.pop();
            System.out.println(answer[i]);
        }

        return answer;
    }
}
