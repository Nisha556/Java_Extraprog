package Extra_prog;
interface Calculator1 {
	void add(int num1 , int num2);
	
}
class CalC1 {
	
	public void letsAdd(int num1 , int num2 )
	{
		System.out.println(num1 + "and" +num2+"add to :" +(num1+num2));
	}
}
interface Messenger1 {
	Message getMessage(String msg);
}
class Message1 {
	Message1(String msg)
	{
		System.out.println(">> Message is" +msg);
	}
}
public class NonStatic {
public static void main(String args[])
{
	 //refernce to nosatic method
		CalC1 calc = new CalC1();
		Calculator1 cRef = CalC1::letsAdd;
		cRef.add(12,23);
}
}
