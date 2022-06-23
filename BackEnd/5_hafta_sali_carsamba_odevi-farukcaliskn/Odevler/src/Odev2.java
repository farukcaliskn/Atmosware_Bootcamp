import java.util.Scanner;

public class Odev2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Bir sayi giriniz : ");
		int number = scanner.nextInt();
		if (number == 1) {
			System.out.println("Asal değil");
		} else if (number == 2) {
			System.out.println("Asal");
		} else {
			int count = 0;
			for (int i = 1; i <= number; i++) {
				if (number % i == 0) {
					count++;
				}
			}
			if (count > 2) {
				System.out.println("Asal değil");
			} else
				System.out.println("Asal");
			{

			}

		}
	}

}
