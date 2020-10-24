/**
  Author:Meghana
  Date:23/10/2020
  desc:Removing all the duplicates in the array. Return the resulting array in descending order
*/
import java.util.*;
public class ArrayFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	     int[]array=new int[5];          //initialising array with the size of 5
	     for(int i=0;i<5;i++)
	     {
	    	 array[i]=sc.nextInt();
	     }
	     ArrayFour a4=new ArrayFour();      //creating an object for class ArrayFour
	     int duplicates=a4.modifyArray(array);   //access method with object a'a4' and set the value to duplicates
	     System.out.println(duplicates);
		}
	
	   int modifyArray(int[] array)         //initialise the method with arguement and return type int
	   { 
		   int k=0;
		   int a[]=new int[5];
		   for(int i=0;i<array.length;i++)
		   {   int count=1;
			   for(int j=i+1;j<array.length;j++)
			   {
				   if(array[i]==array[j])
					   count=count+1;
			   }
			   if(count==1) 
			   {
				   a[k]=array[i];
				   System.out.println(a[k]);
				   k++;
			   }			   
		   }
		   
		  return 1;            //return1


	}

}
