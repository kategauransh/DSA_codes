class sw{
	public static void reverse(int [] arr,int start,int end)
	{

while(start<end){
int temp=arr[start];
arr[start]=arr[end];
arr[end]=temp;
start++;
end--;
}

for(int s:arr){
System.out.print(s);
}
System.out.println();
}
}



public class tcsDemo2
	 {

	public static void main(String[] args)
	 {
	int k=2;
	int[]	arr = {4,5,0,1,9,0,5,0};
	sw.reverse(arr,0,k-1);

        sw.reverse(arr,k+1,arr.length-1);

        sw.reverse(arr,0,arr.length-1);

	}

	}
