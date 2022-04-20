package Easy_package;



public class Baekjoon_4673_selfnum {
	public static void main(String[] args) {

		int index = 10000; // 1~10000까지의 수
		boolean[] nums = new boolean[index]; // 셀프 넘버를 구분할 배열 선언

		for (int i = 0; i < nums.length; i++) {
			if (d(i + 1) < index + 1)
				nums[d(i + 1) - 1] = true; // 셀프 넘버가 아니면 true를 대입
		}
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == false)
				// nums[i]이 i+1에 해당하기 때문에 i+1 출력
				System.out.println(i + 1);
		}
	}

	static int d(int n) {

		int self = n;

		while (n > 0) { // n이 0이 될 때까지 반복
			self += (n % 10); // 일의 자리에 있는 수를 self에 누적
			n /= 10; // 자릿수가 하나씩 줄어듦
		}

		return self;
	}


}// end class
