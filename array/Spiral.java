import java.util.Scanner;

class Spi{
public static void ral(int arr[][],int r,int c){
int left=0,right=c-1,top=0,bottom=r-1;
while(left<=right&&top<=bottom){
//left to right
for( int i=left;i<=right;i++){
System.out.print(arr[top][i]+" ");
}
top++;
//right to bottom
for( int i=top;i<=bottom;i++){
System.out.print(arr[i][right]+" ");
}
right--;
//right yo left
if(top<=bottom){
for( int i=right;i>=left;i--){
System.out.print(arr[bottom][i]+" ");
}}
bottom--;
//left to top
if(left<=right){
for( int i=bottom;i>=top;i--){
System.out.print(arr[i][left]+" ");
}}
left++;
}
}}
public class Spiral{

public static void main(String [] args){
Scanner sc=new Scanner(System.in);

int r=sc.nextInt();
int c=sc.nextInt();
int arr[][]=new int[r][c];
for(int i=0;i<r;i++){
for(int j=0;j<c;j++){
arr[i][j]=sc.nextInt();
}
}
Spi.ral(arr,r,c);
}

}