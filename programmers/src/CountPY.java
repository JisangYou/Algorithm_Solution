public class CountPY {
    boolean solution(String s) {
        boolean answer = true;

        String s_arr[] = s.split("");
        int size = s_arr.length;
        int countP = 0;
        int countY = 0;
        for (int i = 0; i <= size - 1; i++) {
            if (s_arr[i].toLowerCase().equals("p")) {
                countP++;
            } else if (s_arr[i].toLowerCase().equals("y")) {
                countY++;
            }
        }
        if (countP == countY) {
            answer = true;
        } else {
            answer = false;
        }

        return answer;
    }

    // 다른 사람들의 풀이 

//    class Solution {
//        boolean solution(String s) {
//            s = s.toUpperCase();
//
//            return s.chars().filter( e -> 'P'== e).count() == s.chars().filter( e -> 'Y'== e).count();
//        }
//    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub


        String qwer = "pPoooyY";
        CountPY sol = new CountPY();
        sol.solution(qwer);

    }
}
