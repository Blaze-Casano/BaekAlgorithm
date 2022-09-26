package Bronze;

import java.io.*;

/*
 * BufferedReader 을 쓰는 방식이다.
 * 알고리즘상 시간복잡도 O(N) 
 * 또한 BufferedReader 자체가 Scanner 에 비해 우월한 성능을 지니고 있어 훨씬 좋은 performance 를 보여준다.

 

알고리즘 방식은 다음과 같다.

 

먼저 0부터 9까지 체크할 길이 10의 int 배열을 생성한다. (기본 int배열 초기값은 모두 0이다.)

그리고 val 에다가 br.readLine() 으로 읽은 값을 곱해서 저장한다.

그리고 String str 에다가 val 의 Int 형을 String 형으로 변환해준 뒤 for문을 통해 해당 문자열의 문자 값 - 48 (또는 -'0')을 추출해내 int 배열의 index 값을 1 증가시킨다.

 

마지막으로 배열 원소에 저장된 모든 원소를 출력한다.
 */

public class Baekjoon_2577_2 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] arr = new int[10];

		int val = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());

		String str = String.valueOf(val);

		for (int i = 0; i < str.length(); i++) {
			arr[(str.charAt(i) - 48)]++;
		}
		for (int v: arr) {
			System.out.println(v);
		}
	}

}
// 소스코드 출처 https://st-lab.tistory.com/45
