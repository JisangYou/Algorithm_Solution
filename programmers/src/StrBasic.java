public class StrBasic {
    public boolean solution(String s) {
        boolean answer = true;
        char[] chs = s.toCharArray();

        if (chs.length == 4 || chs.length == 6) {
            for (int i = 0; i < chs.length; i++) {
                if ((int) chs[i] < 48 || (int) chs[i] > 57) {
                    answer = false;
                    break;
                } else {
                    answer = true;
                }
            }
        } else {
            answer = false;
        }

        return answer;
    }

    // 다른 사람 풀이, 숫자가 아닌것은 예외로 넘긴다.

//    public boolean solution(String s) {
//        if(s.length() == 4 || s.length() == 6){
//            try{
//                int x = Integer.parseInt(s);
//                return true;
//            } catch(NumberFormatException e){
//                return false;
//            }
//        }
//        else return false;
//    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String qwer = "152334";
        StrBasic sol = new StrBasic();
        System.out.println(sol.solution(qwer));

    }
}
