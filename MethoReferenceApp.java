package Extra_prog;
interface Calculator {
	void add(int num1 , int num2);
	
}
class CalC {
	public static void addSomething(int num1 ,int num2)
	{
		System.out.println(num1+ "and" +num2+ "addition is :"+(num1 +num2) );
		
	}
	public void letsAdd(int num1 , int num2 )
	{
		System.out.println(num1 + "and" +num2+"add to :" +(num1+num2));
	}
}
interface Messenger {
	Message getMessage(String msg);
}
class Message {
	Message(String msg)
	{
		System.out.println(">> Message is" +msg);
	}
}
public class MethoReferenceApp {
public static void main(String args[])
{
//CalC.addSomething(10, 20);
	//Calculator cRef = Calc:: addSomething; // staic method reference
	//cRef.add(11, 14);
	//
	//2. refernce to nosatic method
	//CalC calc = new CalC();
	//Calculator cRef = CalC::letsAdd;
	//cRef.add(12,23);
	
//	 3 reference  to constructor
	Messenger  mref = Message::new;
mref.getMessage("Search the cndle rather than curing the darkness");	
}
}
