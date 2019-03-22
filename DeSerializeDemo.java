import java.io.*;
import java.util.*;
public class DeSerializeDemo
{
	public static void main(String[] args)
	{
		try
		{
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("emp.ser"));
			ArrayList arr = (ArrayList)ois.readObject();

			Iterator i = arr.iterator();
			while(i.hasNext())
			{
				System.out.println(i.next());

			}
			
		/*	Person p1 = (Person) ois.readObject();

			System.out.println(p1.name);
			System.out.println(p1.age);

			Person p2 = (Person) ois.readObject();

			System.out.println(p2.name);
			System.out.println(p2.age);

			//Object p3 = ois.readObject();
			
			//System.out.println(p3);
			//System.out.println(p3.age);
		*/
			System.out.println("Successfully DeSerialized...");

		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	
	}


}