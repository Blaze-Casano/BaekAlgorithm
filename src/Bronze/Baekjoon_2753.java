package Bronze;

import java.util.*;

public class Baekjoon_2753 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year;
		year = sc.nextInt();
		sc.close();

		if ((year % 4 == 0 && !((year % 100) == 0)) || (year % 400 == 0)) {
			System.out.printf("1");

		} else {
			System.out.println("0");
		}

	}
}
