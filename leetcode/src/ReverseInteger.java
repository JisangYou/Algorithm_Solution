import java.util.ArrayList;

public class ReverseInteger {
    public int reverse(int x) {

        int result = 0;

        String arr[] = String.valueOf(x).split("");
        ArrayList tempList = new ArrayList();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            tempList.add(arr[arr.length - i - 1]);
        }
        if (tempList.get(arr.length - 1).equals("-")) {
            tempList.remove("-");
            tempList.add(0, "-");
        }
        if (tempList.get(0).equals("0")) {
            tempList.remove("0");
        }

        for (int i = 0; i < tempList.size(); i++) {
            sb.append(tempList.get(i));
        }

        try {
            result = Integer.parseInt(sb.toString());
        } catch (NumberFormatException e) {
            result = 0;
        }
        return result;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int x = 00000000000000;
        ReverseInteger sol = new ReverseInteger();
        sol.reverse(x);

    }
}
