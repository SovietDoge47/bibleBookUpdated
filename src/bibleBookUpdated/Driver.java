package bibleBookUpdated;
import java.io.File;
import java.util.Scanner;

public class Driver
{
	public static void main(String[] args)
	{
		try
		{
			Scanner fileIn = new Scanner(new File(System.getProperty("user.dir") + "/src/bibleBookUpdated/input.dat"));
			while(fileIn.hasNext())
			{
				NewTestamentBook a = new NewTestamentBook(fileIn.nextLine());
				a.display();
			}
		}
		catch(Exception e)
		{
			System.err.println(e.toString());
		}
	}
}