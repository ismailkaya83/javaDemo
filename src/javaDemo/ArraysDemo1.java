package javaDemo;

public class ArraysDemo1 {

	public static void main(String[] args) {

		String[] ogrenciler = new String[4];
		ogrenciler[0] = "ali";
		ogrenciler[1] = "veli";
		ogrenciler[2] = "deli";
		ogrenciler[3] = "teli";

		for (int i = 0; i < ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);
		}

		for (String ogrenci : ogrenciler) {
			System.out.println(ogrenci);
		}

	}

}
