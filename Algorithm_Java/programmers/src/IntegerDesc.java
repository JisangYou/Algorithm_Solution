import java.util.Arrays;

public class IntegerDesc {
    public long solution(long n) {
        String str = String.valueOf(n);
        String[] strArray = str.split("");
        StringBuilder stringBuilder = new StringBuilder();
        Arrays.sort(strArray);
        for (int i = strArray.length - 1; i >= 0; i--) {
            stringBuilder.append(strArray[i]);
        }
        return Long.parseLong(stringBuilder.toString());
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub


        long n = 118000372;
        IntegerDesc sol = new IntegerDesc();
        sol.solution(n);

    }
}
