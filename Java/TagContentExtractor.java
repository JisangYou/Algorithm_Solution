public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testCases = Integer.parseInt(scan.nextLine());

        while (testCases-- > 0) {
            String line = scan.nextLine();

            boolean matchFound = false;
            Pattern r = Pattern.compile("<(.+)>([^<]+)</\\1>"); //Pattern 클래스를 활용하여 패턴을 정의
            Matcher m = r.matcher(line); // Matcher에 적용
 
            while (m.find()) { // matcher.find()를 활용하여 매치되는 문자
                System.out.println(m.group(2)); // group(num) 매칭된 부분중 num 번 그룹핑 매칭부분 반환
                matchFound = true;
            }
            if ( ! matchFound) {
                System.out.println("None");
            }
        }
    }
}

// 추후 확인 요망

// https://www.hackerrank.com/challenges/tag-content-extractor/forum <- 
/**
<(.+)> ->  matches HTML start tags. The parentheses save the contents inside the brackets into Group #1

. ->  임의의 한문자
+ -> 앞문자가 하나 이상

([^<]+) -> matches all the text in between the HTML start and end tags. We place a special restriction on the text in that it can't have the "<" symbol. The characters inside the parenthesis are saved into Group #2
</\\1> -> is to match the HTML end brace that corresponds to our previous start brace. The \1 is here to match all text from Group #1
by hackerank user
 */