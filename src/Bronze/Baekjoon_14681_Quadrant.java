package Bronze;

import java.util.*;

public class Baekjoon_14681_Quadrant {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x = sc.nextInt();
		double y = sc.nextInt();
		if (x > 0 && y > 0) {

			System.out.println("1");

		}
		if (x < 0 && y > 0) {
			System.out.println("2");
		}
		if (x < 0 && y < 0) {
			System.out.println("3");
		}
		if (x > 0 && y < 0) {
			System.out.println("4");
		}
		sc.close();

	}// end main

}// end class
