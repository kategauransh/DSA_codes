import java.util.Scanner;

class AvgSumofMarks{
public static void shs(int [] arr,int n){
double avg=0;
int sum=0;

for(int s:arr){
sum+=s;
}
avg=(sum/n);

System.out.println("avg of Marks : " + avg);
}
}
public class AvgSum{
public static void main(String []args){
Scanner sc=new Scanner(System.in);

int n=sc.nextInt();
int[] arr=new int[n];

for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
}
AvgSumofMarks.shs(arr,n);

}
}