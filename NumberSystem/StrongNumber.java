import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class checker{

public static int recc(int num){
if(num==0||num==1)
return 1;

return num*recc(num-1);
}


public static void check( int num){
int rep=String.valueOf(num).length();
int sum=0;
while(num>0){
int res=1;

int digit=num%10;

res=res*recc(digit);

sum=sum+res;
num/=10;
}
System.out.println("Strong number value is : "+sum);
}


} 




public class StrongNumber{

public static void main(String args[])throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

int num=Integer.parseInt(br.readLine().trim());
checker.check(num);

}
}