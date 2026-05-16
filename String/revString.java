import java.util.Scanner;
class rev{
public static void r(String str,int n){
if(str==""){System.out.println("empty String ");}
if(str.length()==1){System.out.println("length of string is 1");}

for(int i=n-1;i>=0;i--){
System.out.print(str.charAt(i));
}
}
}
public class revString{
public static void main(String[]args){

Scanner sc=new Scanner(System.in);

String str=sc.nextLine();

int n=str.length();
rev.r(str,n);}
}