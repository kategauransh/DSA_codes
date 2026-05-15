import java.util.Scanner;

class find{
public static void hiSales(int arr[],int n){
int max=arr[0],month=0;
for(int i=0;i<n;i++)
{
if(arr[i]>max){
max=arr[i];
month=i;
}
}
System.out.println("max sales : "+max+" , "+" month : "+(month+1));
}
}
public class SceDemo1{
public static void main(String args[]){
 Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int []arr=new int [n];

for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
}

find.hiSales(arr,n);
}}