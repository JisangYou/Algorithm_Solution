import java.util.Arrays;

public class MockExam {

    public int[] solution(int[] answers) {
        int[] first = new int[]{1, 2, 3, 4, 5};
        int[] second = new int[]{2, 1, 2, 3, 2, 4, 2, 5};
        int[] third = new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int count1 = 0;
        int count2 = 0;
        int count3 = 0;


        for (int i = 0; i < answers.length; i++) {
            for (int j = 0; j < first.length; j++) {
                if (i % first.length == j && answers[i] == first[j]) {
//                    System.out.println("first == " + first[j]);
                    count1++;

                }
            }
            for (int j = 0; j < second.length; j++) {
                if (i % second.length == j && answers[i] == second[j]) {
//                    System.out.println("second == " + second[j]);
                    count2++;
                }
            }
            for (int j = 0; j < third.length; j++) {
                if (i % third.length == j && answers[i] == third[j]) {
//                    System.out.println("third == " + third[j]);
                    count3++;
                }
            }
        }

        System.out.println(count1 + ", " + count2 + ", " + count3);

        if (count1 == 0 && count2 == 0 && count3 == 0) {
            return new int[]{};
        } else if (count1 > count2 && count1 > count3) {
            return new int[]{1};
        } else if (count2 > count1 && count2 > count3) {
            return new int[]{2};
        } else if (count3 > count1 && count3 > count2) {
            return new int[]{3};
        } else if (count1 == count2 && count1 > count3) {
            return new int[]{1, 2};
        } else if (count2 == count3 && count2 > count1) {
            return new int[]{2, 3};
        } else if (count1 == count3 && count1 > count2) {
            return new int[]{1, 3};
        } else {
            return new int[]{1, 2, 3};
        }

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub


//        int[] answers = new int[]{1, 2, 3, 4, 5};
        int[] answers = new int[]{1, 2, 3, 4, 5, 3, 2, 4, 5, 3, 1, 2, 3};
        MockExam sol = new MockExam();
        System.out.println(sol.solution(answers));


    }
}
