package Inheritance;

public class Developer extends Employee 
{
	int developers=10;
	public void projectname()
	{
		System.out.println("projectname is Newspaper agency");
		
	}
	public static void main(String args[])
	{
		Developer d=new Developer();
		d.projectname();
		System.out.println("d.project");
		
	}

}
