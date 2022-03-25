package Easy_package;

import java.util.*;

public class Baekjoon_10872_Factorial {
	static int[] f_stack;// 배열 초기화

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int f = sc.nextInt();
		f_stack = new int[13];
		factorial(f);
		sc.close();

	}

	static void factorial(int f) {
		f_stack[0] = 1;

		for (int i = 1; i <= 12; i++) {
			f_stack[i] = f_stack[i - 1] * i;
			//System.out.println("stacked!"+i);//디버깅용
		}
		System.out.println(factorial_dp(f));

	}

	static int factorial_dp(int f) {
		if (f <= 12) {
			return f_stack[f];

		} else {
			return factorial_dp(f - 1) * f;

		}
	}
}
