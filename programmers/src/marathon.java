import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


class Solution1 {

    /**
     * @param participant
     * @param completion
     * @return 최초  arrayList를 통한 풀이
     * 그러나 시간이 오래걸려서 탈락.
     */
    //    public String solution(String[] participant, String[] completion) {
//        String answer = "";
//
//        ArrayList<String> arrayList = new ArrayList<>();
//
//        for (int i = 0; i <= participant.length - 1; i++) {
//            arrayList.add(participant[i]);
//        }
//        for (int x = 0; x <= completion.length - 1; x++) {
//            arrayList.remove(completion[x]);
//        }
//
//        for (int y = 0; y <= arrayList.size() - 1; y++) {
//            System.out.print(arrayList.get(y));
//            answer = arrayList.get(y);
//        }
//
//        return answer;
//    }

    /**
     * @param participant
     * @param completion
     * @return map을 통한 풀이
     * 그러나 시간이 오래걸려서 탈락.
     *
     * map.getOrDefault 학습 필요.
     */
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        Map<String, Integer> map = new HashMap<>();
        int participantLength = participant.length;
        int completionLength = completion.length;

        for (int i = 0; i <= participantLength - 1; i++) {
            map.put(participant[i], map.getOrDefault(participant[i], 0) + 1);
        }
        for (int x = 0; x <= completionLength - 1; x++) {
            map.put(completion[x], map.getOrDefault(completion[x], 0) - 1);
        }

        for (String key : map.keySet()) {
//            System.out.println(String.format("키 : %s, 값 : %s", key, map.get(key)));
            if (map.get(key) == 1) {
                answer = key;
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
        String participant_str = sc.nextLine();
        String completion_str = sc.nextLine();
        String[] participant = participant_str.substring(1, participant_str.indexOf("]")).replaceAll(" ", "").split(",");
        String[] completion = completion_str.substring(1, completion_str.indexOf("]")).replaceAll(" ", "").split(",");

        Solution1 sol = new Solution1();
        System.out.print(sol.solution(participant, completion));

    }

}

