import java.util.Scanner;
class SHS{
public static void shs(int[] arr ,int n){

if(arr.length<3)return;
int max=Integer.MIN_VALUE;
int smax=Integer.MIN_VALUE;
for(int i=0;i<n;i++){

if(arr[i]>max&&arr[i]!=max){
smax=max;
max=arr[i];
}


}
if(smax==Integer.MIN_VALUE){
System.out.println("no duplicate element");
}
System.out.println("Second max elelmtnt is "+smax);

}
}

public class SHighest{
public static void main(String []args){
Scanner sc=new Scanner(System.in);

int n=sc.nextInt();
int[] arr=new int[n];

for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
}
SHS.shs(arr,n);

}
}