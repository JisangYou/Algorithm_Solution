package ThirtyDaysOfCode;

public class Day4 {

    public class Person {
        private int age;
        private String str_age;

        public Person(int initialAge) {
            if (initialAge < 0) {
                System.out.println("Age is not valid, setting age to 0.");
            } else {
                age = initialAge;
            }
        }

        public void amIOld() {
            if (age < 13) {
                str_age = "You are young.";
            } else if (age >= 13 && age < 18) {
                str_age = "You are a teenager.";
            } else
                str_age = "You are old.";

            System.out.println(str_age);
        }

        public void yearPasses() {

            age++;
        }
    }
}
