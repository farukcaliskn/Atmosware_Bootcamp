import java.util.Scanner;

public class _4_Fibonacci {
	public static long fib(long n) {
		if ((n == 0) || (n == 1))
			return n;
		else
			return fib(n - 1) + fib(n - 2);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long numberCount = 0;
		System.out.print("Lutfen iterasyon adetini giriniz:");
		numberCount = sc.nextInt();
		System.out.println(fib(numberCount));

	}
}
