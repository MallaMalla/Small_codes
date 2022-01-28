import java.util.Scanner;

public class sukupolvet {

	public static void main(String[] args) 
	{
		try
		{
		
		Scanner scanner = new Scanner(System.in);
		int choice;
		int birth;
		int future;
		int past;
		int pastCount;
		
		System.out.println("Valitse haluatko \n1) laskea menneet sukupolvet \n2) laskea tulevat sukupolvet \n3) sulkea ohjelman");
		choice = scanner.nextInt();

		if(choice==1)
		{
			System.out.println("Anna syntym‰vuotesi");
			birth = scanner.nextInt();
			System.out.println("Anna vuosi menneisyydest‰, josta haluat sukupolvien m‰‰r‰n laskettavan");
			past = scanner.nextInt();
			pastCount = CalcPast(birth, past);
			System.out.println("Sukupolvia on ollut yhteens‰ "+pastCount);
		}
		if(choice==2)
		{
			System.out.println("Anna syntym‰vuotesi");
			birth = scanner.nextInt();
			System.out.println("Anna vuosiluku tulevaisuudesta, johon haluat sukupolvien m‰‰r‰n laskettavan");
			future = scanner.nextInt();
			CalcFuture(birth, future);
		}
		if(choice==3)
		{
			System.out.println("Ohjelma sulkeutuu, n‰kemiin!");
		}
		}
		catch(Exception e)
		{
			System.out.println("Tapahtui virhe.");
		}
	}
	
	static int CalcPast(int birth, int past)
	{
		int between = birth - past;
		int count = between / 80;
		return count;
	}
	
	static void CalcFuture(int birth, int future)
	{
		int between = future - birth;
		int count = between / 80;
		System.out.println("Sukupolvia tulee olemaan yhteens‰ "+count);
	}
}
