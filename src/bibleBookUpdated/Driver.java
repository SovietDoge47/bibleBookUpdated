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
			int numLines = 0;
			while(fileIn.hasNext())
			{
				numLines++;
				fileIn.nextLine();
			}
			NewTestamentBook[] books = new NewTestamentBook[numLines];
			fileIn.close();
			fileIn = new Scanner(new File(System.getProperty("user.dir") + "/src/bibleBookUpdated/input.dat"));
			int pos = 0;
			while(fileIn.hasNext())
			{
				books[pos] = new NewTestamentBook(fileIn.nextLine());
				books[pos].display();
			}
		}
		catch(Exception e)
		{
			System.err.println(e.toString());
		}
	}
}