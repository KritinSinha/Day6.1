/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jaggedarray;

/**
 *
 * @author KIIT
 */
public class JaggedArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
     int arr[][]={  
                    {1,5,7,2},
                    {4,3,2},
                    {4,5,6,9},
                    {3,1}
                 };
     int i,j;
     for(i=0;i<=arr.length-1;i++)
     {
     for(j=0;j<=arr[i].length-1;j++)//as columns here are dependent on rows,because no.of columns are not known,but number of rows are.Columns are a function of rows
     
     {
         System.out.print(arr[i][j]);
     }
     System.out.println();
         }
     
     
             }
    
}
