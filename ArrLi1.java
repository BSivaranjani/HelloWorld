import java.io.*;
import java.util.*;
public class ArrLi1 
{
	public static void main(String[] args)throws IOException
	{
		// Size of arraylist
		
		int i,n=5;
		
		// Declaring arraylist with initial size n
		
		ArrayList<Integer>arrli=new ArrayList<Integer>(n);
		
		// Add new element at the end of the list
		
		for(i=1;i<=n;i++)
		{
			arrli.add(i);
		}
		System.out.println("Elements are: "+arrli);
		arrli.remove(3);
		System.out.println("Elements after deletion are: "+arrli);
		for(i=0;i<arrli.size();i++)
		{
			System.out.print(arrli.get(i)+" ");
		}
	}
}

