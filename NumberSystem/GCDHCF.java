import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 class gc{
public static int hc(int a,int b){
while(b!=0){
int temp=b;

b=a%b;
a=temp;
}
return a;
}
}
public class GCDHCF{
public static void main(String []args)throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int a=Integer.parseInt(br.readLine().trim());
int b=Integer.parseInt(br.readLine().trim());

int ress=gc.hc(a,b);

int lcm=(a*b)/ress;
IO.println(lcm);
}
}