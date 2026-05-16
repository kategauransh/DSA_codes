import java.util.Scanner;
class fac{
public static void fss(int f){
int fact=1;
for(int i=0;i<f;i++){
fact=fact*(f-i);
}
System.out.println("factorial is : "+fact);
}


}

public class Facto{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
int f=sc.nextInt();
fac.fss(f);

}
}