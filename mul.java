package Extra_prog;

public class mul {
public int multi(int ... n)
{
	int multiply=1; // we can not write multiply = 0
	int  a;
			for(int i : n)
			{
				multiply =   multiply*i;
		}
			return multiply;	
}
}
class varars {
	public static void main(String args[])
	{
		mul obj =  new mul();
		System.out.println(obj.multi(2,10,30,40));
	}
}