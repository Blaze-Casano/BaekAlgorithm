package Easy_package;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_11654_ASCII {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String st = bf.readLine();
		int num;
		for (int i = 0; i < st.length(); i++) {
			num = st.charAt(i);
			System.out.println(num);
		}
		

	}

}
