import java.util.ArrayList;

public class ShipDemo
{
	public static void main(String[] args) 
	{
		ArrayList<Ship> list=new ArrayList<Ship>();
		
		Ship ship1=new Ship();
		Ship ship2=new Ship();
		
		ship1.setName("DAVISON");
		ship2.setName("DENEBOLA");
		
		ship1.setYear("1982");
		ship2.setYear("1762");
		
		list.add(ship1);
		list.add(ship2);
		
		for(Ship entry:list)
		{
			System.out.printf("Name=%s\tYear=%s\n",entry.getName(),entry.getYear());
		}	
	}
}
