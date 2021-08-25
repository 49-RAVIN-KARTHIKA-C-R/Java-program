//4. Read a matrix from the console and check whether it is symmetric or not.

import java.util.Scanner;
 
class Symmetricmatrix
{  
 public static void main(String args[])
 {
 Scanner sc = new Scanner(System.in);
 
  int i,j,row,col,flag=0;
 System.out.println("Enter the number of rows:");
 row = sc.nextInt();
 System.out.println("Enter the number of columns:");
 col = sc.nextInt();
 
 int[][] mat = new int[row][col];
 
     System.out.println("Enter the elements of the matrix:") ;
     for(i=0;i<row;i++)
     { 
      for(j=0;j<col;j++)
      { 
          mat[i][j] = sc.nextInt();
     }
    }
 
     System.out.println("The elements of the matrix:") ;
     for(i=0;i<row;i++)
     { 
      for(j=0;j<col;j++)
      { 
        System.out.print(mat[i][j]+" ");

       if(mat[i][j]!=mat[j][i])
      flag=1;
     }
       System.out.println("");
    }
    if(flag==0)
     System.out.println("The matrix is symmetric.");
        else
            System.out.println("The matrix is not symmetric.");
     }
 }

 