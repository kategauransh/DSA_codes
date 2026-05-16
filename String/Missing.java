import java.util.Scanner;
class miss{
public static void misses(int []arr,int n){
int sum=(n*(n+1))/2;
int suma=0;
 for(int i=0;i<n-1;i++){
suma= arr[i]+suma;
}

System.out.println("missing number is : "+ (sum-suma));
}
}

public class Missing{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

int n=sc.nextInt();

int arr[]=new int [n];

for(int i=0;i<arr.length;i++){
arr[i]=sc.nextInt();
}

miss.misses(arr,n);
}
}