import java.util.Scanner;
import java.util.Calendar;

public class PvKk 
{

	public static void main(String[] args) 
	{
		try
		{
		Scanner scanner = new Scanner(System.in);
		int choice;
		int year;
		
		System.out.println("Valitse 1 jos haluat tiet‰‰ elinik‰si p‰iviss‰ tai 2 jos haluat tiet‰‰ sen kuukausissa");
		choice = scanner.nextInt();
		System.out.println("Kerro syntym‰vuotesi");
		year = scanner.nextInt();
		
		if(choice==1)
		{
			DayCalc(year);
		}
		else if(choice==2)
		{
			MonthCalc(year);
		}
		}
		catch(Exception e)
		{
			System.out.println("Jotain meni pieleen.");
		}
	}
	
	static void DayCalc(int birth)
	{
		int year = Calendar.getInstance().get(Calendar.YEAR);
		int yBetween = year - birth;
		int months = yBetween * 12;
		int days = months * 30;
		System.out.println("Elinik‰si p‰iviss‰ on "+days);
	}
	
	static void MonthCalc(int birth)
	{
		int year = Calendar.getInstance().get(Calendar.YEAR);
		int yBetween = year - birth;
		int months = yBetween * 12;
		System.out.println("Elinik‰si kuukausissa on "+months);
	}

}
