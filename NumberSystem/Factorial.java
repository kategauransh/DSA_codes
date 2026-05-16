import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class facto{
public static void fact(int n){

int sum=1;

while(n>0){
sum=sum*n;
n=n-1;
}

System.out.println("factorial is : " + sum);
}
}

public class Factorial{
public static void main(String args[]) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int num=Integer.parseInt(br.readLine().trim());
facto.fact(num);
}
}
