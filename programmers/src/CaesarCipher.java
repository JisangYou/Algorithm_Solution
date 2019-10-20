public class CaesarCipher {

    /**
     *
     * @param s
     * @param n
     * @return
     *
     * 시저 암호
     *
     * 공백은 아무리 밀어도 공백입니다.
     * s는 알파벳 소문자, 대문자, 공백으로만 이루어져 있습니다.
     * s의 길이는 8000이하입니다.
     * n은 1 이상, 25이하인 자연수입니다.
     *
     *
     * 이 조건에서 [소문자, 대문자, 공백]들이 애초에 필터링 되서 들어오는게 아닌가 보다...
     * 문제를 잘 못 이해한 것도 있고, 문제가 조금 애매한 것도 있는 것 같음... 아무튼 시간이 오래 걸림.
     *
     */
    public String solution(String s, int n) {
        char[] chars = s.toCharArray();
        int sum;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < chars.length; i++) {
            sum = (int) chars[i] + n;

            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                if (sum > (int) 'Z') {
                    chars[i] = (char) (sum - 26);
                } else {
                    chars[i] = (char) sum;
                }
            } else if (chars[i] >= 'a' && chars[i] <= 'z') {
                if (sum > (int) 'z') {
                    chars[i] = (char) (sum - 26);
                } else {
                    chars[i] = (char) sum;
                }
            } else if ( sum - n == ' ') {
                chars[i] = ' ';
            }
            sb.append(chars[i]);

        }

        return sb.toString();
    }

    //    char[] chars = s.toCharArray();
//    char sum;
//    StringBuilder sb = new StringBuilder();
//
//        for (int i = 0; i < chars.length; i++) {
//        sum = (char) ((int) chars[i] + n);
//
//        if (sum >= 'A' && sum <= 'Z') {
//            chars[i] = sum;
//        } else if (sum >= 'a' && sum <= 'z') {
//            chars[i] = sum;
//        } else if ((int) sum - n == ' ') {
//            chars[i] = ' ';
//        } else if((int)sum>=){
//            chars[i] = (char) ((int) sum - 26);
//        }
//        sb.append(chars[i]);
//
//    }
//
//        return sb.toString();
    public static void main(String[] args) {
        // TODO Auto-generated method stub


        String s = "a B z";
        int n = 4;
        CaesarCipher sol = new CaesarCipher();
        sol.solution(s, n);
    }
}
