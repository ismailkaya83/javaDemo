package javaDemo;

public class miniProjeSesliHarfler {

	public static void main(String[] args) {
		// sesli harfler ince sesli mi kalin sesli mi

		char harf = 'e';

		switch (harf) {

		case 'A', 'a', 'I', 'O', 'o', 'U', 'u':
			System.out.println("Kalin sesli harf");
			break;
		default:
			System.out.println("ince sesli harf");

		}

	}

}
