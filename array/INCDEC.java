package array;

import java.util.Arrays;

class forl {
	public static void Forl(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		for (int x : arr) {
			IO.println(x);
		}
	}

	public static void fre2(int[] arr) {
		int p1 = arr.length / 2;
		int p2 = arr.length - 1;
		Arrays.sort(arr);
		while (p1 < p2) {
			int temp = arr[p1];
			arr[p1] = arr[p2];
			arr[p2] = temp;
			p1++;
			p2--;
		}
		for (int x : arr) {
			IO.print(x + " ");
		}
	}
}

public class INCDEC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 1, 10, 5, 10, 15, 5, 101, 2, 3, 6, 4, 7, 9, 9, 8, 7, 4, 5, 6 };
		forl.Forl(arr);
		forl.fre2(arr);
	}

}
