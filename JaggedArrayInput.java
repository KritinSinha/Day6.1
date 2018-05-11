
package jaggedarrayinput;
import java.util.Scanner;

public class JaggedArrayInput {

   
    public static void main(String[] args) 
    {
     int i,j;
     int arr[][]=new int[4][];
     arr[0]=new int[4]; //these inputs are for columns in the format of 1D array
     arr[1]=new int[2]; //these inputs are for columns in the format of 1D array 
     arr[2]=new int[1]; //these inputs are for columns in the format of 1D array
     arr[3]=new int[5]; //these inputs are for columns in the format of 1D array
     
     for(i=0;i<=arr.length-1;i++)
     {
         for(j=0;j<=arr[i].length-1;j++)
         {
          Scanner sc=new Scanner(System.in);   
         System.out.println("Enter the elements in C1(4),C2(2),C3(1),C4(5)");
          arr[i][j]=sc.nextInt();
          
         }
          
     System.out.println(arr[i][j]);     
          
     }
    
    
    }
     
}
