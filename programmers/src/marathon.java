import javax.sound.midi.SysexMessage;
import java.util.Scanner;


class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        return answer;
    }


    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
        String participant_str = sc.nextLine();
        String completion_str = sc.nextLine();
        String[] participant = participant_str.substring(1, participant_str.indexOf("]")).replaceAll(" ", "").split(",");
        for (int i = 0; i <= participant.length - 1; i++) {
            System.out.print(participant[i]);
        }

//        Solution sol = new Solution();
//        System.out.print(sol.solution(participant, completion));

    }

}

