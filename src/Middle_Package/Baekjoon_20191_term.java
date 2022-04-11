package Middle_Package;

import java.io.*;

public class Baekjoon_20191_term {

	public static void main(String[] args) throws IOException {
		/*
		 * BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 * 
		 * String str0 = br.readLine(); String str1 = br.readLine();
		 * 
		 * char[] sh = str0.toCharArray(); char[] or = str1.toCharArray(); try {
		 * CountByChar(or, sh);
		 * 
		 * } catch (ArrayIndexOutOfBoundsException e) {
		 * 
		 * System.out.println("-1"); }
		 * 
		 * // 규칙성을 알아보자.
		 * 
		 * // debugLin
		 * 
		 * System.out.println("First String : " + S + " \n" +"Second String : " + T);
		 * System.out.println("Total tokens : " + st.countTokens()); for (int i = 0;
		 * st.hasMoreTokens(); i++) System.out.println("#" + i + ": " + st.nextToken());
		 * 
		 * 
		 * }
		 * 
		 * static void CountByChar(char[] origin, char[] shorts) { int challenge = 0;
		 * 
		 * char ore[][] = new char[shorts.length * 2][origin.length * 2]; // 2차원 배열 생성자
		 * for (int i = 0; i < shorts.length; i++) { for (int j = 0; j < origin.length;
		 * j++) { ore[i][j] = origin[j]; ore[i][j + origin.length] = origin[j]; ore[i +
		 * shorts.length][j + origin.length] = origin[j]; ore[i + shorts.length][j] =
		 * origin[j]; }
		 * 
		 * } // 일단 쑤셔박기
		 * 
		 * for (int i = 0; i < shorts.length; i++) { for (int j = 0; j < origin.length;
		 * j++) { if ((ore[i][j] == shorts[i])) { i++; j++; challenge += 1;
		 * 
		 * if (j >= origin.length) { j = 0; challenge += 1; } if (i>= shorts.length) {
		 * break;
		 * 
		 * }
		 * 
		 * }
		 * 
		 * if (j >= origin.length) { j = 0; challenge += 1; }
		 * 
		 * while ((ore[i][j] != shorts[i])) {
		 * 
		 * i++; j++; if (j >= origin.length) { j = 0; challenge += 1; if (i>=
		 * shorts.length) { break;
		 * 
		 * } } if (i == shorts.length - 1) { challenge += 1; break; }
		 * 
		 * }
		 * 
		 * } System.out.println(challenge);
		 * 
		 * }
		 */
	}
}
