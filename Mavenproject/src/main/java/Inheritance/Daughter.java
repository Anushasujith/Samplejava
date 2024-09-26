package Inheritance;

public class Daughter extends Father {
	public void love()
	{
		System .out.println("Daugter is lovable");
	}
	public void married()
	{
		System.out.println("Daughter is married");
	}
	public static void main(String args[])
	{
	
		Daughter d=new Daughter();

		d.love();
		d.married();
	}

}
