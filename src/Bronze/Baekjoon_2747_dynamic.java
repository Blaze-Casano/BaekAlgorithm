package Bronze;

import java.util.*;

public class Baekjoon_2747_dynamic {// 동적 계획법을 사용할 것 이다.
	
	static int[] fibo_save; // 상위단위에서 선언해야 하위 단위 안에서도 쓴다.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		fibo_save = new int[45]; // 크기 45짜리 배열 선언
		fibo(a);
		sc.close();

	}

	static void fibo(int a){
        
        fibo_save[0]=0;
        fibo_save[1]=1; //초기값 지정
        
        for(int i=2; (i<=a)&&(i<45); i++){//0번과 1번을 지정해준뒤 
            fibo_save[i]=fibo_save[i-2]+fibo_save[i-1]; //연산부문 
        }
        
        System.out.println(fibo_dp(a));
    }
	static int fibo_dp(int a) {
		if(a<45) return fibo_save[a];
		else {
			return fibo_dp(a-1)+fibo_dp(a-2);
		}
	}

}
/* 문제 출처
 * https://www.acmicpc.net/problem/2747 
 * 주석 기능이 왜이리 제멋대로일까
 * 주석 테스트
 * ㅌ
 * 
 */
