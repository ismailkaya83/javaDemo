package javaDemo;

public class miniProjeMukemmelSayi {

	public static void main(String[] args) {

		int number = 28;
		int sum = 0;

		for (int i = 1; i < number; i++) {

			if ((number % i) == 0) {
				sum = sum + i;
			}
		}

		if (sum == number) {
			System.out.println("mukemmel");
		} else {
			System.out.println("mukemmel degil");
		}
	}

}
