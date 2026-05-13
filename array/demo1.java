package array;

public class demo1 {
void main() {
	int [] arr= {10,50,20,70,30};
	
	int num=arr[0];
	for(int i=0;i<arr.length;i++) {
	if(arr[i]>num) {
		num=arr[i];
	}	
	}
	IO.print(num);
//	
	
}}
