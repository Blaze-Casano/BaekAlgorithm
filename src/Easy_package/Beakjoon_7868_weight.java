package Easy_package;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*5
55 185
58 183
88 186
60 175
46 155*/

public class Beakjoon_7868_weight {
	static int[][] we;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());

		we = new int[count][4]; //몸무게, 키, 순위, 인덱스

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		for (int i = 0; i < count; i++) {
			for (int j = 0; j < 2; j++) {
				we[j][0] = Integer.parseInt(st.nextToken());
				we[j][1] = Integer.parseInt(st.nextToken());

			}

		}
		
	}

	

	
}
