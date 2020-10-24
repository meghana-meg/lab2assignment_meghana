/**
  Author:Meghana
  Date:23/10/2020
  desc:Reversing the numbers in the array and returns the resulting array in sorted order
*/
import java.util.*;
public class ArrayThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	     int[]array=new int[5];           //initialising the array with size of 5
	     for(int i=0;i<5;i++)
	     {
	    	 array[i]=sc.nextInt();
	     }
	     ArrayThree a3=new ArrayThree();   //creating an object for class ArrayThree
	     System.out.println(a3.getSorted(array));    
	     
		}
	   public static String getSorted(int[] array)   //initialize the method with the argument and return type int
	   {  
		  // int b[]=new int[5];
		   int p=0;int temp=0,rev=0;
		   for(int i=0;i<5;i++)
	        {
			   p=array[i];
		   while(p!=0)
		   {
			  temp=p%10;
			  rev=temp*10+rev;
			  p=p/10;
		   }
		   array[i]=rev;
	   }
		   Arrays.sort(array);
		   
		   return Arrays.toString(array);        //return the array
		  
	}
}


	


