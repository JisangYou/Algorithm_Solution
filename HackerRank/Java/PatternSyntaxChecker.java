import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;


public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        Pattern p = null;
        while (testCases > 0) {
            String pattern = in.nextLine();
            //Write your code
            try{
                p = p.compile(pattern);
                System.out.println("Valid");
            } catch (PatternSyntaxException e){
                System.out.println("Invalid");
            }
            testCases--;
        }
    }
}

//pattern인지 아닌지를 확인하는 메서드