package AlgorythmExample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Binary_serch {
	/*
	 * 전제조건 : 정렬되어있어야함 , 즉 인덱스 0 : Lowest n-1 : higest
	 * key 를 탐색할것이다.
	 * 
	 */
	static int arr[];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int num = Integer.parseInt(st.nextToken());
		arr = new int[num];
		
	}
	int binarySearch1(int key, int low, int high) {
		int mid;

		if(low <= high) {
			mid = (low + high) / 2;

			if(key == arr[mid]) { // 탐색 성공 
				return mid;
			} else if(key < arr[mid]) {
				// 왼쪽 부분 arr[0]부터 arr[mid-1]에서의 탐색 
				return binarySearch1(key ,low, mid-1);  
			} else {
				// 오른쪽 부분 - arr[mid+1]부터 arr[high]에서의 탐색 
				return binarySearch1(key, mid+1, high); 
			}
		}

		return -1; // 탐색 실패 
	}
}

