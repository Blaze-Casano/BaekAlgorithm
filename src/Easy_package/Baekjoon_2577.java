package Easy_package;

import java.util.*;

public class Baekjoon_2577 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int value = (in.nextInt() * in.nextInt() * in.nextInt()); // 입력과 동시에 서로 죄다 곱해버림
		String str = Integer.toString(value);// 곱한 값을 문자열로 바꾼 뒤 str에 담아버림
		in.close(); // 스캐너 닫기

		for (int i = 0; i < 10; i++) {
			int count = 0;
			
			for (int j = 0; j < str.length(); j++) { // str.length - ?
				if ((str.charAt(j) - '0') == i) { // str.charAt - ?
					count++;
				}
			}
			System.out.println(count); // 시간복잡도 O(n^2)
		}

	}
}

/*
 * 숫자의 개수 문제 출처 https://www.acmicpc.net/problem/2577
 * 
 * 문자열로 변환한다음 0~9까지의 문자 갯수를 센다. 비효율적
 * 
 * 
 */
