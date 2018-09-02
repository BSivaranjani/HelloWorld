public class Ship
{
	public String name;
	public String year;
	
	public Ship()
	{
		name=" ";
		year=" ";
	}
	
	public Ship(String n,String y)
	{
		name=n;
	    year=y;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getYear()
	{
		return year;
	}
	public void setYear(String year)
	{
		this.year=year;
	}
	public String toString()
	{
	    return("The Ship's name is: "+getName()+"and the Ship's year is: "+getYear());
	}
}


