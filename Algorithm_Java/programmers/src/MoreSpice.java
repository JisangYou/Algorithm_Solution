
import java.util.*;

public class MoreSpice {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        int result = 0;
        boolean flag = true;

        PriorityQueue<Scoville> pq = new PriorityQueue<>();

        for (int i = 0; i < scoville.length; i++) {
            pq.offer(new Scoville(scoville[i]));
        }

        while (flag) {
            if (answer == scoville.length - 1) {
                return -1;
            }
            result = pq.poll().getSpice() + (pq.poll().getSpice() * 2);
            pq.offer(new Scoville(result));
            if (pq.peek().getSpice() >= K) {
                flag = false;
            }
            answer++;
        }


        return answer;
    }

    public class Scoville implements Comparable<Scoville> {
        int spice;

        public Scoville(int spice) {
            this.spice = spice;
        }

        public void setSpice(int spice) {
            this.spice = spice;
        }

        public int getSpice() {
            return this.spice;
        }


        @Override
        public int compareTo(Scoville scoville) {
            if (getSpice() < scoville.getSpice()) return -1;
            else if (getSpice() >= scoville.getSpice()) return 1;
            return 0;
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

//        int[] scovile = new int[]{1,1,1,1};
        int[] scovile = new int[]{0, 0, 2};
//        int K = 2;
        int K = 4;

        MoreSpice sol = new MoreSpice();
        System.out.print("sol = " + sol.solution(scovile, K));

    }
}
