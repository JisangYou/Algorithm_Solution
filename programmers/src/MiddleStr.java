class MiddleStr {
    public String solution(String s) {

        String[] words = s.split("");
        String answer = "";

        int odd = (int) Math.floor(words.length / 2);
        int even = words.length / 2;
        if (words.length % 2 == 1) {
            answer = words[odd];
        } else {
            answer = words[even - 1].concat(words[even]);
        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        String abcde = "abcde";
        String qwer = "qwer";
        MiddleStr sol = new MiddleStr();
        sol.solution(qwer);

    }
}