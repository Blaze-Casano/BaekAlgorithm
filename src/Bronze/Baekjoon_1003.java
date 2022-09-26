package Bronze;

import java.util.*;
/*
 * 일단 내 생각은 이거야, 피보나치인데 그 항에서 0과 1의 갯수를 세어야하잖아
 * 그렇다면 이제 피보나치를 n = 40 까지 다이나믹으로 구하고 0과 1의 갯수를 세는거지
 * 그럼 결국 숫자의 개수 + 피보나치 라는 유형이라는 것인가?
 */

public class Baekjoon_1003 {
	static int[] fibo_save;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		fibo_save = new int[45];
		fibo(a);
		sc.close();

	}

	static void fibo(int a) {
		fibo_save[0] = 0;
		fibo_save[1] = 1;

		for (int i = 2; (a < 45) && (i < 45); i++) {
			fibo_save[i] = fibo_save[i - 1] + fibo_save[i - 2];

		}
	}

	static int fibo_dp(int a) {
			if(a<45) return fibo_save[a];
			else {
				return fibo_dp(a-2) + fibo_dp(a-1);
				
			}
			
		}

}