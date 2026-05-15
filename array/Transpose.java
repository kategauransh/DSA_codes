class trans{
public static void transpo(int[][] mat){

int n=mat.length;
	for(int i=0;i<n;i++){
	for(int j=i+1;j<n;j++){
	
	int temp=mat[i][j];
	mat[i][j]=mat[j][i];
	mat[j][i]=temp;
}
}

//-------------------------Reverse-------------
for(int i=0;i<n-1;i++){
int r=0;
int c=n-1;
while(r<c){
int temp=mat[i][r];
mat[i][r]=mat[i][c];
mat[i][c]=temp;
r++;
c--;
}
}
for(int i=0;i<n;i++){
for(int j=0;j<n;j++){
System.out.print(mat[i][j]+" ");
}

System.out.println();}
}
}
public class Transpose{

public static void main(String [] args){

int mat[][]={	{1,2,3},
		{4,5,6},
		{7,8,9}
	    };
trans.transpo(mat);	

}

}