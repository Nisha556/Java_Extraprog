package Extra_prog;
interface A {
	public void show();
}
//class Xys implements A {
	//public void show() {
	//	System.o/ut.println("Hello");
		
	//}
//}
public class LambdaDemo {
public static void main(String args[])
{
	A obj;
	//obj = new A() { //Ananous class
	//	public void show(){
			//System.out.println("HEllo");
		//}
	//};
	obj = () -> //lambda expression
	{
		System.out.println("Hello");
		
	};
	obj.show();
	
}
}
