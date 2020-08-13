package Extra_prog;

interface Calculator2 {
	void add(int num1 , int num2);
	
}
class CalC2 {
	public static void addSomething(int num1 ,int num2)
	{
		System.out.println(num1+ "and" +num2+ "addition is :"+(num1 +num2) );
		
	}
	public void letsAdd(int num1 , int num2 )
	{
		System.out.println(num1 + "and" +num2+"add to :" +(num1+num2));
	}
}
interface Messenger2 {
	Message getMessage(String msg);
}
class Message2 {
	Message2(String msg)
	{
		System.out.println(">> Message is" +msg);
	}
}
public class Constructor_ref {
public static void main(String args[])
{
	Messenger2  mref = Message2::new;
	mref.getMessage("Search the cndle rather than curing the darkness");
}
}
