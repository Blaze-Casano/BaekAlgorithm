package Bronze;
import java.util.*;

class Baekjoon_1000 {

	public static void main(String[] args) {
		int A, B;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("A?");

			A = sc.nextInt();

			if (0 > A || A > 10) {
				System.out.println("�ٽ� �Է���");
			}

		} while (0 > A || A > 10);
		//while �� false �϶� Ż��
		do {
			System.out.println("B?");

			B = sc.nextInt();

			if (0 > B || B > 10) {
				System.out.println("�ٽ� �Է���");
			}

		} while (0 > B || B > 10);
		int add = A + B;

		System.out.printf("A + B = %d", add);
		sc.close();
	}
}