public class Person {
    private int age;
    private String str_age;
  
	public Person(int initialAge) {
  		if (initialAge < 0) { // 초기값으로 들어온 나이가, 0보다 작을떄
			System.out.println("Age is not valid, setting age to 0.");
		} else {// 0이 아니면, 다른 클래스에서 받아온 파라미터를 재정의해서 사용.
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