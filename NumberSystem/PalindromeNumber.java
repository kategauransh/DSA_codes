import java.util.Scanner;

class Rev{
public static void  RNumber(int n){
int s=n;
int sum=0;
while(s>0){
sum=10*sum + s%10;
s=s/10;
}
 if(n==sum){
System.out.println(" number is palindrome : "+ sum);
}
else
System.out.println(" number is not palindrome : "+ sum);
}

}



public class PalindromeNumber{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();

Rev.RNumber(n);
}
}