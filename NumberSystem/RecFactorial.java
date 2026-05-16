import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class factoo{
public static int fact(int num){
if(num==0||num==1)
return 1;

return num*fact(num-1);
}
}

public class RecFactorial{
public static void main(String [] args)throws IOException{
BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
int num=Integer.parseInt(br.readLine().trim());
int result=factoo.fact(num);

System.out.println("factorial is: "+ result);
}
}