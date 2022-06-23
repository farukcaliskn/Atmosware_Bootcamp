import java.util.Scanner;

public class _2_StringReverse {
	public static void main(String[] args) {
		getData();
	}

	public static void getData() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lutfen Baslangic sayisini giriniz : ");
		String str = scanner.nextLine();
		scanner.close();
		reverse(str);
	}

	public static void reverse(String str) {
		String newString = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			String ch1 = "" + str.charAt(i);

			newString = newString + ch1;
		}
		System.out.println(newString);
	}
}
