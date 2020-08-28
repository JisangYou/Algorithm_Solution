public class HidePhoneNum {
    public String solution(String phone_number) {

        String str[] = phone_number.split("");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length; i++) {

            if (i >= str.length - 4) {
                sb.append(str[i]);
            }else{
                sb.append("*");
            }

        }
        return sb.toString();

//        다른 사람 풀이
//        String[] p = phone_number.split("");
//        for(int i = 0 ; i<p.length-4 ; i++){
//            p[i] = "*";
//        }
//        return String.join("", p);
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub


        String phone = "01033334444";
        HidePhoneNum sol = new HidePhoneNum();
        sol.solution(phone);
        System.out.println();

    }
}
