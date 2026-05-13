package array;

class rev {

	public static void revv(int[] aar, int n) {
		int ar[] = new int[n];
		int j = 0;
		for (int i = n - 1; i >= 0; i--) {
			ar[j] = aar[i];
			j++;
		}
		for (int i : ar) {
			IO.print(i + " ");
		}

		IO.println();
	}

//------------------------------------------------------------

	public static void twop(int[] arr, int n) {
		int p1 = 0;
		int p2 = n - 1;

		while (p1 < p2) {
			int temp = arr[p1];
			arr[p1] = arr[p2];
			arr[p2] = temp;
			p1++;
			p2--;
		}

		for (int i : arr) {
			IO.print(i + " ");
		}
	}

}

public class Reverse {

	void main() {
		int arr[] = { 6, 5, 4, 3, 2, 1, };
		int n = arr.length;
		rev.revv(arr, n);
		rev.twop(arr, n);
	}
}
