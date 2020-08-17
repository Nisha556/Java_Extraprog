package Extra_prog;

public class Calc {
public int add(int ... n)
{
	int sum=0;
	for(int i :n)
	{
		sum = sum+i;
		
	}
	return sum;
}
}
 class VarargsDemo 
 {
public static void main(String args[])
{
	Calc obj = new Calc();
	System.out.println(obj.add(4,5,6,3,6,7));
}
}