import java.util.Scanner;
class Rev{
public static void revs(String str){
char[] ch=new char[str.length()];
for(int i=0;i<str.length();i++){
ch[i]=str.charAt(i);
}

for(int i=str.length()-1;i>=0;i--){
System.out.print(ch[i]+" ");
}
}
}

public class Reverse{

public static void main(String []args){
Scanner sc=new Scanner(System.in);
String str=sc.next();
Rev.revs(str);
}
}