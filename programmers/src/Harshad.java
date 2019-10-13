public class Harshad {
    public boolean solution(int x) {
        boolean answer = true;
        String str = x + "";
        String[] arr = str.split("");
        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            result += Integer.parseInt(arr[i]);
        }

        if (x % result == 0) {
            answer = true;
        } else {
            answer = false;
        }

        return answer;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub


//        int arr = 10;
//        int arr = 12;
        int arr = 11;
//        int arr = 13;
        Harshad sol = new Harshad();
        sol.solution(arr);

    }
}
