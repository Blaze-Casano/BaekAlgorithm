package Middle_Package;

import java.util.*;

public class Baekjoon_2447_printstar {
	static char[][] arr;
	static int x, y, n;
	static boolean blank;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		arr = new char[n][n];

		sc.close();

		check(0, 0, n, false);

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				sb.append(arr[i][j]);

			}
			sb.append('\n'); //?

		}
		System.out.print(sb);

	}// end main

	static void check(int x, int y, int n, boolean blank) {

		// 공백칸일 경우
		if (blank) {
			for (int i = x; i < x + n; i++) {
				for (int j = y; j < y + n; j++) {
					arr[i][j] = ' ';

				}

			}
			return;
		}
		if (n == 1) {
			arr[x][y] = '*';
			return;
		}
		/*
		 * n =27 일 경우 한 블로그이 사이즈는 9이고 n=9 일경우 한 블록의 사이즈는 3이듯 해당 블록의 한 칸에 담을 변수를 의미한다. 즉
		 * size
		 * 
		 * count 는 별 출력 누적을 의미한다
		 */

		int size = n / 3;
		int count = 0;
		for (int i = x; i < x + n; i += size) {
			for (int j = y; j < y + n; j += size) {
				count++;
				if (count == 5) { // 공백 칸일 경우
					check(i, j, size, true);

				} else {
					check(i, j, size, false);
				}

			}

		}
	}

}// end class

/* BufferdWriter? BufferedReader? vs Scanner
 * Source : https://st-lab.tistory.com/95
 */
