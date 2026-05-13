package array;

import java.util.HashMap;
import java.util.Map;

class freq {
	public static void frequ(int[] arr, int n) {
		int count = 0;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			IO.println(arr[i] + " " + count);
			count = 0;

		}
	}

	public static void fre1(int[] arr, int n) {
		HashMap<Integer, Integer> hp = new HashMap<>();
		for (int x : arr) {
			hp.put(x, hp.getOrDefault(x, 0) + 1);
		}
		System.out.println(hp);
		IO.println();
		for (Map.Entry<Integer, Integer> entry : hp.entrySet()) {
			IO.println(entry.getKey() + " " + entry.getValue());
		}

	}
}

public class Count {

	public static void main(String[] args) {
		int arr[] = { 10, 5, 10, 15, 5, 101, 2, 3, 6, 4, 7, 9, 9, 8, 7, 4, 5, 6 };
		int n = arr.length;
//     freq.frequ(arr, n);
		freq.fre1(arr, n);
	}

}
