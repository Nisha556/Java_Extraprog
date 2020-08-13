package Extra_prog;
interface A {
	public void show();
}
class Xys implements A {
	public void show() {
	System.out.println("Hello");
		
	}
}
public class Anonymous {
public static void main(String args[])
{
	A obj;
	obj = new A() { //Anonymous class
			public void show(){
				//System.out.println("HEllo");
			}
		};
}
}
