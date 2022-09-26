package Bronze;

public class test_case {
    public static void main(String[] args) {
        System.out.println(solution(6));
    }
    public static int solution(int num) {
        int count = 0;
        int answer = 0;
        if(num == 1){
            answer = 0;
        }else{
            answer = collatz(num, count);
        }
        return answer;
    }

    public static int collatz(int num, int count){

        while(num == 1){
            if(num % 2 == 1){
                num = num*3 +1;
                count ++;
            }else if(num % 2 == 0){
                num = num/2;
                count ++;
            }else if(count>=500){
                num = 1;
                count = -1;
            }
        }
        return count;


    }

}

