package array;
class Doingsum{
	public static void summ(int []arr) {
		int sum=0;
		for(int i:arr) {
			sum+=i;
		}
		IO.print(sum);
	}
}
public class Sum {

	public static void main(String[] args) {
		int arr[] = { 1,2,3};
Doingsum.summ(arr);
	}

}
