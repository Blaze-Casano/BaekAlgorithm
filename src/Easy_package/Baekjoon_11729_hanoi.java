package Easy_package;

import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Baekjoon_11729_hanoi {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void top(int N, int start, int goal) throws IOException{
		int anum = 6/(start*goal);
		if(N == 1) {
			bw.write(String.valueOf(1) + " " + String.valueOf(3));
		}
		else if(N == 2) {
			bw.write(String.valueOf(start) + " " + String.valueOf(anum));
			bw.newLine();
			bw.write(String.valueOf(start) + " " + String.valueOf(goal));
			bw.newLine();
			bw.write(String.valueOf(anum) + " " + String.valueOf(goal));
			bw.newLine();
		}
		else {
			top(N-1, start, anum);
			bw.write(String.valueOf(start) + " " + String.valueOf(goal));
			bw.newLine();
			top(N-1, anum, goal);
		}
			
	}
	
	public static void main(String[] args) throws IOException {
		
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		long cnt = (long) (Math.pow(2, N)-1);
		
		bw.write(String.valueOf(cnt));
		bw.newLine();
		
		top(N,1,3);
		
		bw.flush();
		bw.close();
		
		sc.close();
					
	}
	
}
