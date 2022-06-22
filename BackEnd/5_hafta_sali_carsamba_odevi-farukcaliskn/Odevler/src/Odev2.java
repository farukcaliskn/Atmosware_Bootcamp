import java.util.Scanner;

public class Odev2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Bir sayi giriniz : ");
		int number = scanner.nextInt();

		int count = 0;

		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				count++;
			}
		}
		if (count > 2) {
			System.out.println("Asal değil");
		} else {
			System.out.println("Asal");
		}
	}

}
