import java.util.*;
public class ArrayListCollection 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(2);
		al.add(3);
		al.add(5);
		al.add(7);
		al.add(11);
		
		ArrayList<Integer> al1=new ArrayList<Integer>(al);
		
		ArrayList<Integer> al2=new ArrayList<Integer>();
		
		al2.add(13);
		al2.add(17);
		al2.add(19);
		al2.add(23);
		al2.add(29);
		
		al1.addAll(al2);
		System.out.println(al1);
	}
}
