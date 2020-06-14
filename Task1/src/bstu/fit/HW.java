package bstu.fit;
import bstu.fit.isit.Calc2;
public class HW
{
	public static void main(String[] args)
	{
		System.out.println("Hello world!");
		Calc1 calc1 = new Calc1();
		System.out.println("Calc1.sum(10,2): " + calc1.sum(10,2));
		System.out.println("Calc1.sub(10,2): " + calc1.sub(10,2));
		Calc2 calc2 = new Calc2();
		System.out.println("Calc2.mul(2,3): " + calc2.mul(2,3));
		System.out.println("Calc2.div(50,2): " + calc2.div(50,2));
	}
}