package array;
import java.util.Arrays;
class large{
	
	
	public static void larr(int []arr,int n) {
		if(n==0||n==1) {
			IO.print("array has only two elements");
		return;
		}
	
		
		
		Arrays.sort(arr);
	
		int small=arr[1];
		int largg=arr[n-2];
		
		IO.print(small+" "+largg);
		IO.println();
		
	}
	
	
//---------------------------------------------------------------------	
	
	public static void find(int []arr,int n) 
	{
		if(n==0||n==1) {
			IO.print("only two elements in the array "+-1+" " + -1);
		
		return;
		}
	int sml=Integer.MAX_VALUE,Ssml=Integer.MAX_VALUE;
	int lrg=Integer.MIN_VALUE,Slrg=Integer.MIN_VALUE;
	
	for(int i=0;i<arr.length;i++) {
		sml=Math.min(sml, arr[i]);
		lrg=Math.max(lrg, arr[i]);}
	for(int i=0;i<n;i++) {
		if(arr[i]<Ssml&&arr[i]!=sml) {
			Ssml=arr[i];
		}if(arr[i]>Slrg&&arr[i]!=lrg) {
			Slrg=arr[i];
		}
		}
	
	IO.print(Ssml+" "+Slrg);
	
	}	
}
public class Demo2 {

	public static void main(String[] args) {
		
		int[] arr= {1,2,3,6,5,4,7,8,9,9,6,2};
		
		int n=arr.length;
		large.larr(arr, n);
		large.find(arr, n);
		
	}

}
