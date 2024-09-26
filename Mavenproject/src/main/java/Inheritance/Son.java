package Inheritance;

public class Son extends Father{
	public void feelings()
	{
		System.out.println("son shares feelings with father");
	}
public void study()
{
	System.out.println("son is studying");
}
	public static void main(String[] args) {

	Son s=new Son();
s.feelings();
s.study();

	}

}
