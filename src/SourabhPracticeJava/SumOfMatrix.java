package SourabhPracticeJava;

public class SumOfMatrix {
public static void main(String[] args) {
//   int a[][]= {{1,2,3},{4,5,6}};
//   int b[][]= {{7,8,9},{10,11,12}};
//   int c[][]=new int [2][3];
//   for(int i=0;i<2;i++)
//   {
//	   for(int j=0;j<3;j++)
//	   {
//		   c[i][j]=a[i][j]+b[i][j];
//		   System.out.print(c[i][j]+" ");
//		   
//	   }
//	   System.out.println();
//   }
	
	
	//a[i][j]*b[i][j])+(a[i+1][j+1]*b[i+1][j+1])+(a[i+2][j+2]*b[i+2][j+2]
	
//	 int a[][]= {{1,1,1},{2,2,2},{3,3,3}};
//	   int b[][]= {{1,1,1},{2,2,2},{3,3,3}};
//	   int c[][]=new int [3][3];
//   
//   for(int i=0; i<3; i++)
//   {
//	   for(int j=0; j<3; j++)
//	   {
//		   
//		   c[i][j]=0;
//		   for(int k=0; k<3; k++)
//		   {
//			   c[i][j]= c[i][j]+(a[i][k]*b[k][j]);
//
//		   }
//		   System.out.print(c[i][j]+" ");
//	   }
//	   System.out.println();
//   }
int a[][]= {{4,5,6},{7,8,9},{10,11,12}};
int b[][]= {{1,2,3},{4,5,6},{7,8,9}};
int c[][]=new int[3][3];
for(int i=0;i<3;i++)
{
  for(int j=0;j<3;j++)
  {

	  c[i][j]=a[i][j]-b[i][j];
	  System.out.print(c[i][j]+" ");
  }
  System.out.println();
}
}
}
