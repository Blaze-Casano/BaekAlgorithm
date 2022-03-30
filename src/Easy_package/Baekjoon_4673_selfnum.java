package Easy_package;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Baekjoon_4673_selfnum {
	static int a, temp, count[];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		a = sc.nextInt();
		
		// count = new int[(int) (Math.log10(a)+1)]; 자리수 개수만큼의 배열 생성
		
		
		
		// 자릿수 배열 찐으로 생성
		// System.out.println(Arrays.toString(count)); 입력 배열 출력용
		
		sc.close();
		
		Summing(a);
		System.out.println(a);
		
		//while (a < 10000) {}
			


	}// end main

	static int Summing(int a) {
		count = Stream.of(String.valueOf(a).split("")).mapToInt(Integer::parseInt).toArray();
		for (int i = 0; i < count.length; i++) {
			a += count[i];
		}
		System.out.print(Arrays.toString(count));
		return a;

	}// end summing

}// end class
