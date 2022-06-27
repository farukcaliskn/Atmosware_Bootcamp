import java.util.Scanner;

public class _3_AsalSayi {
	public static void main(String[] args) {
		int number, prime;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Pozitif bir sayi giriniz : ");
		number = scanner.nextInt();

		prime = isPrime(number, number / 2);

		if (prime == 1) {
			System.out.println(number + " sayisi asaldir");
		} else {
			System.out.println(number + " sayisi asal değildir");
		}
	}

	private static int isPrime(int num, int i) {
		if (i == 1) {
			return 1;
		} else {
			if (num % i == 0) {
				return 0;
			} else
				return isPrime(num, i - 1);
		}
	}
}
