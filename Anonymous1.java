package Extra_prog;

interface Cab2 {
	double bookCab(String source, String destinition);

}
class UberX implements Cab{
	public void bookCab()
	{
		System.out.println("UberX Booked || Arriving soon");
	}
}
public class Anonymous1 {
public static void main(String args[])
{
	Cab2  cab = new Cab2()
	{
public void bookCab() {
	System.out.println("Uber is Arriving soon");
}
	};
	cab.bookCab();
}
}
