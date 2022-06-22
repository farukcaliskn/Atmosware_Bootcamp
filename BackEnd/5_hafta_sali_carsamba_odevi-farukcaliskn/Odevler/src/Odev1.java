import java.util.Scanner;

public class Odev1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Vize notunuzu giriniz : ");
		double vizeNot = scanner.nextDouble();
		System.out.print("Final notunuzu giriniz : ");
		double finalNot = scanner.nextDouble();
		int ortalama = (int) ((vizeNot + finalNot) / 2);
		System.out.println(ortalama);
		if (ortalama < 50) {
			System.out.println("Bu Dersten Kaldınız");
		} else if (ortalama == 50) {
			System.out.println("Bu Dersten Geçtiniz");
		} else if (55 <= ortalama && ortalama <= 70) {
			System.out.println("Bu Dersten BB İle Geçtiniz");
		} else if (70 <= ortalama && ortalama <= 84) {
			System.out.println("Bu Dersten BA İle Geçtiniz");
		} else if (84 <= ortalama && ortalama <= 100) {
			System.out.println("Bu Dersten AA İle Geçtiniz");
		}

	}
}
