public class Solution {

  public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double meal_cost = in.nextDouble();
		double tip_percent = in.nextDouble();
		double tax_percent = in.nextDouble();
		in.close();

		double dollors = 0;

		dollors = meal_cost + (meal_cost * (tip_percent / 100) + (meal_cost * (tax_percent / 100)));
		System.out.println("The total meal cost is " + (int)Math.round(dollors) + " dollars.");

	}
}