import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


class primer{
public static void check(int n){

int count=0;
for(int i=1;i<=n;i++){
if(n%i==0){
count++;
}

}
if(count==2){
System.out.println(" a prime");
}
else System.out.println(" not a prime number ");


}

}

public class primeNumber{
public static void main(String args[])throws IOException{

BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

int num=Integer.parseInt(br.readLine().trim());
primer.check(num);

}


}