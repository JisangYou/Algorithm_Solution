import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        stringSplit(s);
        scan.close();
    }


    public static void stringSplit(String s) {
        if (s.length() > (400000)) {
            return;
        }

        s = s.trim();   // this takes care of leading white space

        if (s.length() == 0) // if length is zero --> print 0 (delimeters)
        {
            System.out.print(0);
            return;
        }

        String delims = "[ .,?'!-@_]+";

        String[] tokens = s.split(delims); // store tokens in an array
        System.out.println(tokens.length); // print them out to console


        for (String string : s.split(delims)) {
            System.out.println(string);
        }
    }
}
