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

	/*
	 * 본인이 시도한 더미 public static void main(String[] args) { Scanner sc = new
	 * Scanner(System.in);
	 * 
	 * a = sc.nextInt();
	 * 
	 * // count = new int[(int) (Math.log10(a)+1)]; 자리수 개수만큼의 배열 생성
	 * 
	 * 
	 * 
	 * // 자릿수 배열 찐으로 생성 // System.out.println(Arrays.toString(count)); 입력 배열 출력용
	 * 
	 * sc.close();
	 * 
	 * Summing(a); System.out.println(a);
	 * 
	 * //while (a < 10000) {}
	 * 
	 * 
	 * 
	 * }// end main
	 * 
	 * static int Summing(int a) { count =
	 * Stream.of(String.valueOf(a).split("")).mapToInt(Integer::parseInt).toArray();
	 * for (int i = 0; i < count.length; i++) { a += count[i]; }
	 * //System.out.print(Arrays.toString(count)); return a;
	 * 
	 * }// end summing
	 */
}// end class
