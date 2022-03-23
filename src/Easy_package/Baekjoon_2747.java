package Easy_package;
import java.util.*;
//재귀방식 피보나치 수열, 그러나 계산시 많은 자원을 사용
public class Baekjoon_2747 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();//스캐너
		
		System.out.println(fibo(a));//출력값
	}

static int fibo(int a) {//함수부문
	if (a==1||a==0) return 1;
	return fibo(a-1) + fibo(a-2); //계산부문
	}
}

