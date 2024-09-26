package Inheritance;

public class Car extends Vehicle
{
	String model="BMW";
	public void display()
	{
		System.out.println("method of car :"   +  model);
		System.out.println("speed");
	}

	public static void main(String[] args) 
	{
		Car c=new Car();
		c.display();
		c.show();
	
	// TODO Auto-generated method stub

	}

}
