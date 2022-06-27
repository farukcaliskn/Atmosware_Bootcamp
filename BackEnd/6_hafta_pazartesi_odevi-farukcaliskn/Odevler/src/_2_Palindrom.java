import java.util.Scanner;

public class _2_Palindrom {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Kelime giriniz: ");
		String str = scanner.nextLine();
		String newStr = "";

		for (int i = (str.length() - 1); i >= 0; i--) {
			newStr += str.charAt(i);
		}
		if (newStr.equals(str)) {
			System.out.println("Girilen kelime Palindrom bir kelimedir.");
		} else {
			System.out.println("Girdiginiz kelime Palindrom bir kelime degildir.");
		}
	}
}
