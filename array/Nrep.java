import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
class NonRep{
public static void np(int arr[],int n){

HashMap <Integer,Integer> hp=new HashMap<>();

for(int i:arr){
hp.put(i,hp.getOrDefault(i,0)+1);
}
for(Map.Entry<Integer,Integer> s: hp.entrySet()){
if(s.getValue()==1){
System.out.print("non repeating id "+ s.getKey());
}
}}}

public class Nrep{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int [] arr=new int[n];
for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
}

NonRep.np(arr,n);
}
}