package Inheritance;

public class Puppy extends Dog {
	String type="pomerian";
public void show()
{
	System.out.println(type);
}
	public static void main(String[] args) {
		Puppy p=new Puppy();
		p.run();
		p.bark();
		p.show();
		System.out.println("Animal leg is" +p.animalleg );
		// TODO Auto-generated method stub

	}

}
