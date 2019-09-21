class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

class MyRegex {

    String zeroTo255 = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
    public String pattern = zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255;


}

//      1)  \\d{1,2} catches any one or two digit number
//
//        2) (0|1)\\d{2} catches any three digit number starting with 0 or 1.
//
//        3) 2[0-4]\\d catches numbers between 200 and 249.
//
//        4) 25[0-5] catches numbers between 250 and 255.
//
//        Note that \d represents digits in regular expressions, same as [0-9]
//
//        Edit: Replaced "." with "\." as suggested in some of the comments

//          from hackerank

// 또다른 풀이

// "(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)"
// https://blog.outsider.ne.kr/360

// 추후에 정규식 공부가 필요. 완전 이해하지 못했음.