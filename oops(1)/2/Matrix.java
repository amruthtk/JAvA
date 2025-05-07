import java.util.Scanner;
class Matrix
{
public static void main(String args[])
{

int col1,row1,row2,col2,i,j;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of rows of first matrix:");
row1=sc.nextInt();
System.out.println("Enter the number of columns in first matrix:");
col1=sc.nextInt();
int matrix1[][]=new int[row1][col1];
System.out.println("Enter the values of first matrix:");
for(i=0;i<row1;i++)
   {
   for(j=0;j<col1;j++)
      {
      matrix1[i][j]=sc.nextInt();
      }
      System.out.println();
   }
System.out.println("Enter the number of rows in second matrix :");
row2=sc.nextInt();
System.out.println("Enter the number of colomn in the second matrix:");
col2=sc.nextInt();
int matrix2[][]=new int[row2][col2];
System.out.println("enter the values of second matrix:");
for(i=0;i<row2;i++)
	{
	for(j=0;j<col2;j++)
	{
	matrix2[i][j]=sc.nextInt();
	}
	System.out.println();
	}
System.out.println("First matrx:");
for(i=0;i<row1;i++)
{
	for(j=0;j<col1;j++)
	{
	System.out.print(matrix1[i][j]+" ");
	}	
	System.out.println();
	}
System.out.println("Second matrix:");
	{
	for(i=0;i<row2;i++)
	{
	for(j=0;j<col2;j++)
	{
	System.out.print(matrix2[i][j]+" ");
	}
	System.out.println();
	}
	
	}
if(row1==row2&&col1==col2)
   {
   int matrix3[][]=new int[row1][col1];
   for(i=0;i<row1;i++)
      {
      for(j=0;j<col1;j++)
         {
         matrix3[i][j]=matrix1[i][j]+matrix2[i][j];
         }
      }
    System.out.println("Matrix after adition:");
    for(i=0;i<row1;i++)
       {
       for(j=0;j<col1;j++)
          {
          System.out.print(matrix3[i][j]+" ");
          }
       System.out.println();
       }
    }
else
 {
 System.out.println("Add not possible");
 }
}
}
	
