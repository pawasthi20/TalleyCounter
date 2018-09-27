/**
 * 
 * @author pawasthi20
 *
 */
public class TalleyCounter 
{
	//Instance Variables
	
	private int count;
	
	//Constructors
	
	public TalleyCounter()
	{
		count = 0;
		
	}
	
	public TalleyCounter(int a)
	{
		count = a;
	}
	
	//methods
	
	public void click()
	{
		count+=1; //count = count + 1
		//another option count +=1
	}
	
	public int getCount()
	{
		return count;
	}
	
	public void unClick()
	{
		count--;
	}
	
	public void reset()
	{
		count = 0;
	}

}