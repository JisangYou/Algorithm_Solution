import javax.sound.midi.SysexMessage;
import java.util.LinkedList;
import java.util.Queue;

public class RecentCounter {


    Queue<Integer> q;

    public RecentCounter() {
        q = new LinkedList();
    }

    public int ping(int t) {
        q.add(t);
        while (q.peek() < t - 3000) {
//            q.poll();
            System.out.println("  check : " + q.poll() + " == ");
        }
        System.out.println("q.size() == " + q.size());
        return q.size();
    }


    public static void main(String[] args) {
        // TODO Auto-generated method stub

        RecentCounter sol = new RecentCounter();
        sol.ping(1);
        sol.ping(100);
        sol.ping(3001);
        sol.ping(3002);
        sol.ping(5000);


//        System.out.print(sol.ping(1));
//        System.out.print(sol.ping(100));
//        System.out.print(sol.ping(3001));
//        System.out.print(sol.ping(3002));

    }
}
