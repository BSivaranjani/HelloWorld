import java.io.*;
import java.util.*;
public class ArrayListDemo 
{
	public static void main(String[] args)throws IOException
	{
		ArrayList al=new ArrayList();
		System.out.println("Initial size of arraylist: "+al.size());
		
		// add elements to arraylist
		al.add("A");
		al.add("C");
		al.add("D");
		al.add("E");
		al.add("F");
		al.add("G");
		al.add(1,"B");
		System.out.println("size of arraylist after addition: "+al.size());
		
		// display the array list
		System.out.println("Elements in array list are: "+al);
		
		// remove elements from array list
		al.remove("F");
		al.remove(5);
		System.out.println("Size of arraylist after deletions: "+al.size());
		System.out.println("Elements in array list are: "+al);
	}
}
