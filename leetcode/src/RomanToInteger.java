
import java.util.ArrayList;
import java.util.List;

public class RomanToInteger {
    public int romanToInt(String s) {

        String[] str = s.split("");
        ArrayList arr = new ArrayList();


        for (int i = 0; i < str.length; i++) {
            switch (str[i]) {
                case "I":
                    arr.add(1);
                    break;
                case "V":
                    arr.add(5);
                    break;
                case "X":
                    arr.add(10);
                    break;
                case "L":
                    arr.add(50);
                    break;
                case "C":
                    arr.add(100);
                    break;
                case "D":
                    arr.add(500);
                    break;
                case "M":
                    arr.add(1000);
                    break;
            }
        }
        int temp = 0;

        for (int i = 0; i < arr.size() - 1; i++) {

            if ((int) arr.get(i) >= (int) arr.get(i + 1)) {
                temp += (int) arr.get(i);
            } else {
                temp += -(int) arr.get(i);
            }
        }

        return temp + (int) arr.get(arr.size() - 1);
    }


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String s = "MCMXCIV";
        RomanToInteger sol = new RomanToInteger();
        sol.romanToInt(s);

    }
}
