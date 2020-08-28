

public class FindTheTownJudge {

//    The town judge trusts nobody.
//    Everybody (except for the town judge) trusts the town judge.
//    There is exactly one person that satisfies properties 1 and 2.

    public int findJudge(int N, int[][] trust) {

        int[] voted = new int[N + 1]; // 각 사람이 다른 사람에게 주는 총 투표
        int[] votes = new int[N + 1];  // 각사람이 많은 총 투표

        for (int i = 0; i < trust.length; i++) {
            voted[trust[i][0]]++; // 한사람이 다른 사람에게 주는 표, 내가 선사하는 표
            votes[trust[i][1]]++; // 한사람이 다른 사람으로부터 받은 표,  선사 받은 표
//            System.out.println("trust[i][0] = " + trust[i][0]);
//            System.out.println("trust[i][1] = " + trust[i][1]);
//            System.out.println("voted[trust[i][0]]++ = " + voted[trust[i][0]]++);
//            System.out.println("votes[trust[i][1]]++ = " + votes[trust[i][1]]++);
        }

        for (int i = 1; i <= N; i++) {

            if (votes[i] == N - 1 && voted[i] == 0) {  // 모든 사람들은 판사를 믿는다, 판사는 아무도 믿지 않는다.
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

//        int trust[][] = {{1, 3}, {2, 3}};
//        int trust[][] = {{1, 2}, {2, 3}};
//        int N = 3;
//        int trust[][] = {{1, 3}, {2, 3}, {3, 1}};
        int trust[][] = {{1, 3}, {1, 4}, {2, 3}, {2, 4}, {4, 3}};
        int N = 4;

        FindTheTownJudge sol = new FindTheTownJudge();
        System.out.print("sol = " + sol.findJudge(N, trust));

    }
}
