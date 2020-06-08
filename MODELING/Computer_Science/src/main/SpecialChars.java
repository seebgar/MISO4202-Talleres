package main;

public class SpecialChars {
	public static void main(String[] args) {
		String cadena = "line: a70 and z72 will be replaced, aa24 and a876 will not";
		cadena = cadena.replaceAll("(^| )+[a-z][0-9][0-9]( |$)+", " *** ");
		System.out.println(cadena);
	}
}
