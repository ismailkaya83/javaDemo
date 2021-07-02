package javaDemo;

public class stringsDemo {

	public static void main(String[] args) {
		
		String mesaj = "Bugun hava cok guzel";
		System.out.println(mesaj);
		
		System.out.println("eleman sayisi :" + mesaj.length());
		System.out.println("5. eleman : " + mesaj.charAt(4));
		System.out.println(mesaj.concat(" Yasasin!"));
		System.out.println(mesaj.startsWith("B"));
		System.out.println(mesaj.endsWith("."));
		System.out.println(mesaj.indexOf('a')); // ilk a'nin indexi,
		System.out.println(mesaj.lastIndexOf('a')); // ilk a, sondan dogru
		
		System.out.println(mesaj.replace(' ', '-'));
		System.out.println(mesaj.substring(2)); //2.indexten itibaren kes
		System.out.println(mesaj.subSequence(2, 9));
		
		for (String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
		}
		
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		
		System.out.println(mesaj.trim());
	}

}
