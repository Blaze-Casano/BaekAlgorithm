package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.String.*;

public class Baekjoon_2231_hap {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(bf.readLine());

        for (int i = 0; i < input; i++) {
            int cons = i;
            int result = 0;
            String[] digit = valueOf(cons).split("");

            for (int j = 0; j < valueOf(cons).length(); j++) {
                result += Integer.parseInt(digit[j]);
            }
            result += i;

            if (result == input) {
                System.out.println(cons);
                i = input; //너무 하드코딩한거같은데,
            }
            if (cons == input-1) {
                System.out.println("0");

            }


        }

    }

    //for 대신 while 나 if 대신 Switch 문을 사용해야할듯 싶다.

}
