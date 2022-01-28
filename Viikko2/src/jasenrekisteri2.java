import java.util.Scanner;
import java.io.FileWriter;
import java.io.File;

public class jasenrekisteri2 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Haluatko \n1) Lis‰t‰ j‰senen rekisteriin \n2) Tulostaa koko j‰senrekisterin");
		int ans = scanner.nextInt();
		
		if(ans == 1)
		{
			lisays();
			System.out.println("Haluatko \n1) tallentaa toise j‰senen \n2) palata p‰‰valikkooon \n3) lopettaa ohjelman");
		}
		
		else
		{
			tulostus();
		}
		
		
	}

	//metodi lis‰‰m‰‰n j‰senen rekisteriin
	public static void lisays()
	{
		FileWriter writer = new FileWriter("jasenrekisteri.txt");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Anna nimesi ja puhelinnumerosi");
		String info = scanner.nextLine();
		writer.write(info);
		writer.close();
		
	}
	
	//metodi tulostamaan j‰senrekisteri
	public static void tulostus()
	{
		File file = new File("jasenrekisteri.txt");
		Scanner reader = new Scanner(file);
		
		while (reader.hasNextLine())
		{
			String data = reader.nextLine();
			System.out.println(data);
		}
		reader.close();
	}
}
