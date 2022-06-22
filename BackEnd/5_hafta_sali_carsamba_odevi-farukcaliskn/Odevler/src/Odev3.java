import java.util.Scanner;

public class Odev3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Bir sayi giriniz : ");
		int number = scanner.nextInt();
		int faktoriyel = 1;
		for (int i = 1; i <= number; i++) {
			faktoriyel = faktoriyel * i;
		}
		System.out.println(faktoriyel);
	}
}
