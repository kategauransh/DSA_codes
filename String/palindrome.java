import java.util.Scanner;

class pali{
public static void pal(String str){
int p1=0,p2=str.length()-1;
boolean plin=true;
str=str.toLowerCase();
while(p1<p2){
if(str.charAt(p1)!=str.charAt(p2)){
//System.out.println("not a palindrome");
plin=false;
break;
}
p1++;
p2--;
}

if(plin==true)
System.out.println("String is palindrome");
else System.out.println("String is not palindrome");
}
}
public class palindrome{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();

pali.pal(str);
}
}