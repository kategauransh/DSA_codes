class sm{

public static void searchMatrix(int [][] matrix,int target)
{

for(int i=0;i<matrix.length-1;i++){
for(int j=0;i<matrix.length-1;j++){
if(matrix[i][j]==target)
System.out.println("target found");
}

}
System.out.println("target not found");
}
}


public class Matrix{

 public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 4, 8},
                {10, 11, 12, 13},
                {14, 20, 30, 40}
        };

        int target = 10;

sm.searchMatrix(matrix, target);
    }
}
