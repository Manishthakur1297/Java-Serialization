public class Person implements java.io.Serializable
{
	String name;
	transient int age;

	public Person()
	{

	}
	
	public Person(String name, int age)
	{
		this.age = age;
		this.name = name;
	}

	public String toString()
	{
		System.out.println(this.name);
		System.out.println(this.age);
		return "";
	}


}