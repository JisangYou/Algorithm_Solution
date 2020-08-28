package Java;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaRegex2DuplicateWords {
    public static void main(String[] args) {

        String regex = "\\b(\\w+)(?:\\W+\\1\\b)+";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());

        while (numSentences-- > 0) {
            String input = in.nextLine();

            Matcher m = p.matcher(input);

            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                input = input.replaceAll(m.group(), m.group(1));
            }

            // Prints the modified sentence.
            System.out.println(input);
        }

        in.close();
    }
}

/**
 * CASE_INSENSITIVE, MULTILINE, DOTALL, UNICODE_CASE, CANON_EQ, UNIX_LINES, LITERAL and COMMENTS
 * <p>
 * <p>
 * 자바에서 정규식을 사용하기 위해서는 Pattern, Matcher 클래스 객체가 필요합니다.
 * 문자열로 정의한 정규 표현식을 Pattern 객체로 만들기 위해 Pattern 클래스의 compile() 메소드를 사용합니다.
 * 컴파일된 패턴은 Matcher 객체를 만드는 데 사용되며, Matcher객체는 임의의 입력 문자열이 패턴에 부합되는지 여부를 판가름하는 기능을 가지고 있습니다.
 * Pattern 객체들은 비상태 유지 객체들이기 때문에 여러 개의 Matcher 객체들이 공유
 * <p>
 * <p>
 * <p>
 * 출처: https://ktko.tistory.com/entry/JAVA-자바의-정규표현식-Pattern-Matcher [KTKO 개발 블로그와 여행 일기]
 * <p>
 * find() : 패턴이 일치하는 경우 true를 반환하고, 그 위치로 이동(여러개가 매칭되는 경우 반복 실행가능)
 * find(int start) : start위치 이후부터 매칭검색을 수행
 * start() : 매칭되는 문자열 시작위치 반환
 * start(int group) : 지정된 그룹이 매칭되는 시작위치 반환
 * end() : 매칭되는  문자열 끝 다음 문자위치 반환
 * end(int group) : 지정되 그룹이 매칭되는 끝 다음 문자위치 반환
 * <p>
 * group() : 매칭된 부분을 반환
 * group(int group) : 매칭된 부분중 group번 그룹핑 매칭부분 반환
 * groupCount() : 패턴내 그룹핑한(괄호지정) 전체 갯수 반환
 * matches() : 패턴이 전체 문자열과 일치할 경우 true 반환
 * <p>
 * 출처: https://enterkey.tistory.com/353 [Hello World]
 */