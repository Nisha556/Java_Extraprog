package Extra_prog;

public class AA {
private static A obj;
private AA() {
}
public static AA getAA() {
	if(obj == null)
	{
		synchronized(Singleton.class) {
			if(obj== null)
			{
				obj= new Singleton();
				
			}
		}
	}
	return obj;
}
public void doSomething();