import java.util.Scanner;

public class _1_MukemmelSayi {
	public static void main(String[] args) {
		_1_MukemmelSayi perfcetNumber = new _1_MukemmelSayi();
		perfcetNumber.getData();

	}

	public void getData() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lutfen Sayi Giriniz");
		int number = Math.abs(scanner.nextInt());
		perfertControl(number);
	}

	public void perfertControl(int number) {
		int div = 0;
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				div += i;
			}
		}
		if (div == number) {
			System.out.println(number + " : Sayisi Mukemmeldir");
		} else {
			System.out.println(number + " : Sayisi Mukemmel degildir");
		}
	}
}
