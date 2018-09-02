import java.util.*;

// Demonstrate working of values(),ordinal() and valueOf() methods
// values -> return all values present inside enum
// ordinal-> return enum constant index
// valueOf-> return specified enum cconstant
enum Col
{
	BLACK,WHITE;
}
public class TestEnum3
{
	public static void main(String[] args)
	{
		// Calling values
		Col arr[]=Col.values();
		
		// enum with loop
		for(Col c:arr)
		{
			// Calling ordinal
			System.out.println(c+" at index"+c.ordinal());
		}
		System.out.println(Col.valueOf("WHITE"));	
	}
}
