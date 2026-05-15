import java.util.Scanner;
class FindTarget
{
  public static void find(int [][] arr,int r,int c,int target){
	boolean found=false;
for(int i=0;i<r;i++){
for(int j=0;j<c;j++){
if(arr[i][j]==target)
{
	found=true; 
	break;
}
}

}
System.out.print("Element in the matrix  : "+found);
}
}

public class  targetMatrix{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);

int r=sc.nextInt();
int c=sc.nextInt();

int [][] arr=new int [r][c];
for(int i=0;i<r;i++){
for(int j=0;j<c;j++){
arr[i][j]=sc.nextInt();
}
}
int target=sc.nextInt();
FindTarget.find(arr,r,c,target);
}
}