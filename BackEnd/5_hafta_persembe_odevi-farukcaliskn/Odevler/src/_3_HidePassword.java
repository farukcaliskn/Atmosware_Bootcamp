import java.util.Scanner;

public class _3_HidePassword {
	public static void main(String[] args) {
		getData();
	}

	public static void getData() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Lutfen Baslangic sayisini giriniz : ");
		String str = sc.nextLine();
		sc.close();
		passwordHide(str);
	}

	public static void passwordHide(String str) {
		String newString = "";
		for (int i = 0; i < str.length(); i++) {

			if (i == 0) {
				String ch1 = "" + str.charAt(i);
				newString = newString + ch1;
			} else if (str.length() - 1 == i) {
				String ch1 = "" + str.charAt(i);
				newString = newString + ch1;
			} else {
				newString = newString + "*";
			}
		}
		System.out.println(newString);
	}
}
