import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Tower {
    public int[] solution(int[] heights) {
        int[] answer = {};
        Stack<Integer> stack = new Stack<Integer>();
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < heights.length; i++) {

            stack.push((int) heights[i]);

        }
        for (int i = 0; i < heights.length; i++) {
            System.out.println(stack.peek());
            if (heights[heights.length - i - 1] <) {

            }
        }

        for (int i = 0; i < queue.size(); i++) {
            System.out.println(((LinkedList<Integer>) queue).get(i));
        }
        return answer;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

// 발사한 신호는 신호를 보낸 탑보다 높은 탑에서만 수신
        int[] heights = new int[]{6, 9, 5, 7, 4};
        Tower sol = new Tower();
        sol.solution(heights);

    }
}
