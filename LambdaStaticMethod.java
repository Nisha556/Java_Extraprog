package Extra_prog;
interface Calculator {
	void add(int num1 , int num2);
	
}
class CalC {
	public static void addSomething(int num1 ,int num2)
	{
		System.out.println(num1+ "and" +num2+ "addition is :"+(num1 +num2) );
		
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
class LambdaStaticMethod {
	public static void main(String args[])
	{
	CalC.addSomething(10, 20);
		Calculator cRef = Calc:: addSomething; // static method reference
		cRef.add(11, 14);
		
}

}
