package Easy_package;
import java.util.*;

class Baekjoon_10869 {

	public static void main(String[] args) {
		int A, B;
		int ans0, ans1, ans2, ans3, ans4;
		Scanner sc = new Scanner(System.in);
		sc.close();

		A = sc.nextInt();
		B = sc.nextInt();

		ans0 = A + B;
		ans1 = A - B;
		ans2 = A * B;
		ans3 = A / B;
		ans4 = A % B;

		System.out.printf("%d\n", ans0);
		System.out.printf("%d\n", ans1);
		System.out.printf("%d\n", ans2);
		System.out.printf("%d\n", ans3);
		System.out.printf("%d\n", ans4);

	}
}