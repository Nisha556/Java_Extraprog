package Extra_prog;
import java.math.BigInteger;
import java.util.Scanner;
import java.math.BigInteger;

public class example {
static BigInteger factorial(int N)
{
	BigInteger f = new BigInteger("1");
	for(int i = 2; i<=N; i++)
		f= f.multiply(BigInteger.valueOf(i));
}
public static void main(String args[])
{
	int N= 20;
	System.out.println(factorial(N));
	
}
}
