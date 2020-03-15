import javax.sound.midi.SysexMessage;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class FindTheTownJudge {

    public int findJudge(int N, int[][] trust) {

        ArrayList arr1 = new ArrayList();
        ArrayList arr2 = new ArrayList();
        Set set1 = new HashSet();

        for (int i = 0; i < trust.length; i++) {
            arr1.add(trust[i][0]);
            set1.add(trust[i][1]);
        }

        for (int i = 0; i < arr1.size(); i++) {
            if (set1.contains(arr1.get(i))) {
                arr2.add(trust[i][0]);
                set1.remove(arr1.get(i));

            }
        }

        if (set1.isEmpty()) {

            N = -1;

        } else {
            Iterator<Integer> it = set1.iterator();
            while (it.hasNext()) {
//            System.out.println("set2: " + it.next());
                N = it.next();
            }

            for (int i = 0; i < arr1.size(); i++) {
                
            }

        }


        return N;
    }

    public static void main(String[] args) {

//        int trust[][] = {{1, 3}, {2, 3}};
        int trust[][] = {{1, 2}, {2, 3}};
        int N = 3;
//        int trust[][] = {{1, 3}, {2, 3}, {3, 1}};
//        int trust[][] = {{1, 3}, {1, 4}, {2, 3}, {2, 4}, {4, 3}};
//        int N = 3;

        FindTheTownJudge sol = new FindTheTownJudge();
        System.out.print(sol.findJudge(N, trust));

    }
}
