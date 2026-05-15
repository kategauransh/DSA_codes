

/*
 * Problem Statement –

A chocolate factory is packing chocolates into the packets. The chocolate packets here represent an array  of N number of integer values. The task is to find the empty packets(0) of chocolate and push it to the end of the conveyor belt(array).

Example 1 :

N=8 and arr = [4,5,0,1,9,0,5,0].
 * 
 * */

class choco{
	public static void chocc(int arr[])
	 {
		int j=0;
		for(int i=0;i<arr.length;i++)
	{
			if(arr[i]!=0)
			{
			int temp=arr[i];		
			arr[i]=arr[j];
			arr[j]=temp;
			j++;
                        }
	}
		for(int s:arr){
 		System.out.println(s);	
                              }
                                             }
	 }
public class TcsDemo1
	 {

	public static void main(String[] args)
	 {
	int[]	arr = {4,5,0,1,9,0,5,0};
	choco.chocc(arr);
	}

	}
