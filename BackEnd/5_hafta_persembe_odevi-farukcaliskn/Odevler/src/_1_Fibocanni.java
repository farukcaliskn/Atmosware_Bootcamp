import java.util.Scanner;

public class _1_Fibocanni {
	public static void main(String[] args) {
		getData();
	}

	public static void getData() {
		Scanner sc = new Scanner(System.in);
		int firstNumber = 0, numberCount = 0;
		System.out.print("Lutfen Baslangic sayisini giriniz : ");
		firstNumber = sc.nextInt();
		System.out.print("Lutfen iterasyon adetini giriniz:");
		numberCount = sc.nextInt();
		sc.close();
		fibonacci(firstNumber, numberCount);

	}

	public static void fibonacci(int firstNumber, int numberCount) {
		int previusNumber = firstNumber, number = firstNumber, nextNumber = 0;
		if (firstNumber == 0) {
			System.out.println("hesaplanamaz.");
		} else {
			System.out.print(previusNumber + ",");
			for (int i = 0; i < numberCount; i++) {

				System.out.print((number) + ",");
				nextNumber = previusNumber + number;
				previusNumber=number;
				number=nextNumber;

			}
		}

	}
}
