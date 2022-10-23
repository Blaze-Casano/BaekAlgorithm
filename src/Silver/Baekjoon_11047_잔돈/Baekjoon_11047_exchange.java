package Silver;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

/*
문제
        준규가 가지고 있는 동전은 총 N종류이고, 각각의 동전을 매우 많이 가지고 있다.

        동전을 적절히 사용해서 그 가치의 합을 K로 만들려고 한다. 이때 필요한 동전 개수의 최솟값을 구하는 프로그램을 작성하시오.

        입력
        첫째 줄에 N과 K가 주어진다. (1 ≤ N ≤ 10, 1 ≤ K ≤ 100,000,000)

        둘째 줄부터 N개의 줄에 동전의 가치 Ai가 오름차순으로 주어진다. (1 ≤ Ai ≤ 1,000,000, A1 = 1, i ≥ 2인 경우에 Ai는 Ai-1의 배수)

        출력
        첫째 줄에 K원을 만드는데 필요한 동전 개수의 최솟값을 출력한다.

        예제 입력 1
        10 4200
        1
        5
        10
        50
        100
        500
        1000
        5000
        10000
        50000
        예제 출력 1
        6
        예제 입력 2
        10 4790
        1
        5
        10
        50
        100
        500
        1000
        5000
        10000
        50000

        src : https://www.acmicpc.net/problem/11047
 */
public class Baekjoon_11047_exchange {
    public static void main(String[] args) throws IOException {
        //초기 세팅
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine()," ");
        //input params
        List<Integer> coins = new ArrayList<>();
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int ans = 0;
        for (int i = 0; i < N; i++) {
            coins.add(Integer.valueOf(bf.readLine()));
        }
        Collections.reverse(coins);

        //향상된 반복문 쓸때 (변수타입 반복문 내 사용 변수명 : Collections - etc)
        for(Integer coin : coins){
            ans += K/coin;
            K = K%coin;
        }

        System.out.println(ans);
    }
}
