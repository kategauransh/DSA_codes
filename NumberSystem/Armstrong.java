import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


class arm{
public static void check(int n){
 int ori=n;
int sum=0;
int count=String.valueOf(n).length();

while(n>0){
int digit=n%10;
sum=sum+(int)Math.pow(digit,count);
n/=10;
}
 if (sum ==ori) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong");
        }

}
}

public class Armstrong {
public  static void main(String args[])throws IOException{


BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));

int n=Integer.parseInt(bf.readLine().trim());
arm.check(n);
} 

}