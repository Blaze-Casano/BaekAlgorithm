package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_2798_Blackjack {
	static int temp[], sum, result = 0;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 버퍼를 전체적으로 읽어들인다
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		// 한번에 들어오는 입력을 라인별로 끊어서 다르게 저장한다
		// StringTokenizer te = new StringTokenizer(br.readLine(), " ");

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		temp = new int[n];
		// 해당 변수를 먼저 입력받고 이를 통해 배열을 생성시킨다

		st = new StringTokenizer(br.readLine(), " "); // st 라인으로 줄별로 끊어서 토큰으로 만든다.
		for (int i = 0; i < temp.length; i++) {
			temp[i] = Integer.parseInt(st.nextToken());
		}

		Select(temp, n, m);

		// Compare(sum);

		System.out.println(result);

		// 그리고 배열의 요소들을 입력받는다
		/*
		 * System.out.println(n); System.out.println(m);
		 * System.out.println(Arrays.toString(temp)); //debug
		 */
	}

	static int Select(int temp[], int n, int m) { // 선택해서 전부 더해버릴거에요
		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				for (int j2 = j + 1; j2 < n; j2++) {
					sum = temp[i] + temp[j] + temp[j2];

					if (m == sum) {
						result = sum;

					}

					if (result < sum && sum < m) {
						result = sum;

					}

				}

			}

		}

		return result;
	}

	/*
	 * static int Compare(int sum) { //정렬할거에요
	 * 
	 * return result; }
	 */

}

/*
 * 설계 모든 조합 경우의 수를 때려박는다. 그다음 각 수를 비교해서 가장 가까운 수를 출력해낸다. 라는 것.
 */
