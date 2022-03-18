package Easy_package;
import java.util.*;

class Baekjoon_1000 {

	public static void main(String[] args) {
		int A, B;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("A?");

			A = sc.nextInt();

			if (0 > A || A > 10) {
				System.out.println("다시 입력해");
			}

		} while (0 > A || A > 10);
		//while 이 false 일때 탈출
		do {
			System.out.println("B?");

			B = sc.nextInt();

			if (0 > B || B > 10) {
				System.out.println("다시 입력해");
			}

		} while (0 > B || B > 10);
		int add = A + B;

		System.out.printf("A + B = %d", add);
	}
}