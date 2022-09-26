package Bronze;

import java.util.*;

class Baekjoon_1008 {

	public static void main(String[] args) {
		double A, B;
        double ans;
		Scanner sc = new Scanner(System.in);

		A = sc.nextFloat();
		B = sc.nextFloat();

		ans = A / B;
		sc.close();
		System.out.printf( "%.9f" ,ans);

	}
}
