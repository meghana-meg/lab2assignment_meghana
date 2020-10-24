/**
  Author:Meghana
  Date:23/10/2020
  desc:Returning  the second smallest element in the array
*/
import java.util.*;
public class ArrayOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	     int[]array=new int[5];          // Array initialisation with the size of 5
	     for(int i=0;i<5;i++)
	     {
	    	 array[i]=sc.nextInt();
	     }
	     ArrayOne a=new ArrayOne();       //creating an object for class ArrayOne
	     int secondSmallest=a.getSecondSmallest(array);   //access method with object 'a' and set the value to second smallest
	     System.out.println(secondSmallest);
		}
	   int getSecondSmallest(int[] array)      //method creation with array
	   {
		   for(int i=0;i<array.length;i++)
		   {
			   for(int j=i+1;j<array.length-1;j++)
			   {
				   if(array[i]<array[j])
				   {
					   int temp=array[i];
					   array[i]=array[j];
					   array[j]=temp;
				   }
			   }
		   }
		   return array[2];                //return the smallest element in the array


	}

}
