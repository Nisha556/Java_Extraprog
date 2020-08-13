package Extra_prog;

interface Cab {
	double bookCab(String source, String destinition);

}
/*class UberX implements Cab{
	public void bookCab()
	{
		System.out.println("UberX Booked || Arriving soon");
	}
}*/
class LambdaApp
{
	int instancevar = 10;
	static int sVar = 100;
	public static void main(String args[])
	{
	//1	//Cab cab = new  UberX();public voi
		//cab.bookCab();
		//2 Ananymous class
		/*Cab  cab = new Cab()
				{
			public void bookCab() {
				System.out.println("Uber is Arriving soon");
			}
				};
				cab.bookCab();*/
	}
		//3. using Lambda work with the functional interface
		Cab cab = (source,destinition) -> {
			int locaVar =100;
			System.out.println("Uber Booked !!"+source+"to "+destinition+" Arriving soon");
			System.out.println("Instatnce variable is " + instancevar);
			System.out.println("Static variable is" +LambdaApp.sVar);
			return 850.12;
		};
		
		double fare = cab.bookCab("Mumbai", "pune");
		//System.out.println("Fare shall be" +fare);
		
	
}