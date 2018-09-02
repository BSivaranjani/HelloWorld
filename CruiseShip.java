public class CruiseShip extends Ship
{
	public int maxp;
	
	public CruiseShip()
	{
		maxp=0;
	}
	public CruiseShip(int mp,String n,String y)
	{
		super(n,y);
		maxp=mp;
	}
	public int getMaxp()
	{
		return maxp;
	}
	public void setMaxp(int maxp)
	{
		this.maxp=maxp;
	}
	public String toString()
	{
		return("The Ship's name is: "+getName()+"and the Ship's max passengers is: "+getMaxp()+"and the Ship's year is: "+getYear());
	}
}
    