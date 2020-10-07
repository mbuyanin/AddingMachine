package cse360assignment02;


public class testingclass 
{
	public static void main(String[] args)
	{
		AddingMachine a = new AddingMachine();
		a.add(5);
		a.add(25);
		a.subtract(13);
		System.out.println(a.getTotal());
		System.out.println(a.toString());
		a.clear();
		a.add(-15);
		System.out.println(a.getTotal());
		System.out.println(a.toString());
	}
}
