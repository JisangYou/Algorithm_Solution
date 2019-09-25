import java.util.*;

class K_Num {

    /**
     *
     * @param array
     * @param commands
     * @return
     *
     * copyOfRange 메소드 찾아보기
     */

    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int[] temp;
        for (int i = 0; i <= commands.length - 1; i++) { //commands[0].length로 해서 테스트 케이스에서 계속 틀렸음. 2차원 행렬에 대한 학습이 더 필요.

            int first = commands[i][0] - 1;
            int second = commands[i][1] - 1;
            int tempSize = second - first + 1;
            temp = new int[tempSize];
            for (int x = first; x <= second; x++) {
                temp[x - first] = array[x];
            }
            Arrays.sort(temp);
            answer[i] = temp[commands[i][2] - 1];
        }


        return answer;
    }


    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int[] array = new int[]{1, 5, 2, 6, 3, 7, 4};
        int[][] commands = new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        K_Num sol = new K_Num();
        sol.solution(array, commands);

    }

}
