package Easy_package;

import java.util.*;

class Baekjoon_1008 {

	public static void main(String[] args) {
		double A, B;
        double ans;
		Scanner sc = new Scanner(System.in);

		A = sc.nextFloat();
		B = sc.nextFloat();

		ans = A / B;
		
		System.out.printf( "%.9f" ,ans);
		//출력명세 잘보세요 이게 소수점 9재짜리까지입니다.

	}
}