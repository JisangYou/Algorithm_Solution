public class Solution {

  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1;
            int x;
            try {
                s1 = sc.next();
                x = sc.nextInt();
                System.out.println(String.format("%-15s%03d", s1, x));
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            // Complete this line

            

        }
        System.out.println("================================");

    }
}