import java.util.Scanner;
class revwords{
public static void rev(String str){

String[] ss=str.split(" ");
for(int i=ss.length-1;i>=0;i--){
System.out.print(ss[i]+" ");
}

}

}

public class ReverseWords{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
revwords.rev(str);

}
}