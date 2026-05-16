import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class fib{
public static void series(int num){
int a=0;
int b=1;
System.out.print(" "+ a+" "+b +" ");
for(int i=2;i<num;i++){

int c=a+b;

System.out.print(c+" ");

a=b;
b=c;
}
}
}

public class Fibo{
public static void main(String [] args)throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int num=Integer.parseInt(br.readLine().trim());

fib.series(num);
}
}