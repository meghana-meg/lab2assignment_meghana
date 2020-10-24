/**
  Author:Meghana
  Date:23/10/2020
  desc:Sort strings
*/
import java.util.*;
public class ArrayTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	     String[]array=new String[4];	   //initialising the array with  size of 4                                   
	     for(int i=0;i<=3;i++)            
	     {
	    	 array[i]=sc.nextLine();
	     }
	     ArrayTwo a2=new ArrayTwo();        //creating an object for class ArrayTwo
	     String alphabetical=a2.sortStrings(array);   //access method with the object 'a2' and set the value to alphabetical 
	     System.out.println(alphabetical);
	}
String sortStrings(String[] array)           // initialising the method with the argument and return type string
{
	for(int i=0;i<array.length;i++)
	   {
		   for(int j=i+1;j<array.length;j++)
		   {
			   if(array[i].compareTo(array[j])>0)
			   {
				   String temp=array[i];
				   array[i]=array[j];
				   array[j]=temp;
			   }
			   
		   }
	   }
	for(int i=0;i<array.length;i++) {
		if(i<4/2)
		{
			array[i]=array[i].toUpperCase();
		}
		else 
			array[i]=array[i].toLowerCase();
	}
	
	return Arrays.toString(array);          // return the array


	}

}
