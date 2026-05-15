import java.util.*;

class findSL{
public static void find(int arr[]){
int sl=Integer.MIN_VALUE;
int maxx=arr[0];
for(int x:arr){
 maxx=Math.max(maxx,x);
}
IO.println(maxx);

for(int i=0;i<arr.length;i++){
if(arr[i]>sl&&arr[i]!=maxx){
	sl=arr[i];
}
}

IO.println(sl);
}
}
public class Slargest{
public static void main(String[]args){
int [] arr={1,2,3,4,5,6,6,7,7};
findSL.find(arr);
}
}