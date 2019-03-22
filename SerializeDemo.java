import java.io.*;
import java.util.*;
public class SerializeDemo
{
	public static void main(String[] args)
	{
		try
		{
			ArrayList<Person> arr = new ArrayList<Person>();
			arr.add(new Person("Manish",21));
			arr.add(new Person("MJ",31));
			arr.add(new Person("RJ",23));
			arr.add(new Person("Shubham",28));
			arr.add(new Person("Manish",21));
		/*	Person p1 = new Person();
			p1.name = "Manish";
			p1.age = 21;
			
			Person p2 = new Person();
			p2.name = "MJ";
			p2.age = 22;
		*/
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("emp.ser"));
			oos.writeObject(arr);
		//	oos.writeObject(p2);

			System.out.println("Successfully Serialized...");

		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	
	}


}