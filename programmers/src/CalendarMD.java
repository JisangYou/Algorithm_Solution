import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;


public class CalendarMD {
    public String solution(int a, int b) {
        String answer = "";
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2016);
        calendar.set(Calendar.MONTH, a-1);
        calendar.set(Calendar.DATE, b);

        int days = calendar.get(Calendar.DAY_OF_WEEK);


        switch (days) {
            case 1:
                answer = "SUN";
                break;
            case 2:
                answer = "MON";
                break;
            case 3:
                answer = "TUE";
                break;
            case 4:
                answer = "WED";
                break;
            case 5:
                answer = "THU";
                break;
            case 6:
                answer = "FRI";
                break;
            case 7:
                answer = "SAT";
                break;
        }

        return answer;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub


        int month = 5;
        int day = 24;
        CalendarMD sol = new CalendarMD();

        sol.solution(month, day);

    }
}
