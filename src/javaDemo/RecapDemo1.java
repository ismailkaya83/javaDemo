package javaDemo;

public class RecapDemo1 {

	public static void main(String[] args) {
		// en buyuk sayiyi bulmak

		int sayi1 = 20;
		int sayi2 = 25;
		int sayi3 = 2;

		// solution

		int enBuyuk = sayi1;

		if (enBuyuk < sayi2) {
			enBuyuk = sayi2;
		}

		if (enBuyuk < sayi3) {
			enBuyuk = sayi3;
		}

		System.out.println("En buyuk = " + enBuyuk);

	}

}
