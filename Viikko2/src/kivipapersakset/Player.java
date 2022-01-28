package kivipapersakset;

import java.util.Scanner;
import java.util.Random;

public class Player 
{
	Scanner scanner = new Scanner(System.in);
	

	private String name;
	int wins;
	int rMove;
	int mMove;
	
	public void setName(String newName)
	{
		name = newName;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String RandomName()
	{
		String names[] = {"Milla" , "Maija" , "Marko" , "Mikko" , "Maarit" , "Mikael", "Mervi", "Markus" , "Muriel" , "Mariel"};
		String rName = (names[new Random().nextInt(names.length)]);
		
		return rName;
	}
	
	public void randomMove()
	{
		int min = 1;
		int max = 4;
		rMove = (int)(Math.random() * (max-min)) + min;
		System.out.println("Vastustajan valinta tehty");		
	}
	
	public void makeMove()
	{
		System.out.println("Valitse 1)kivi 2)paperi 3)sakset:");
		mMove = scanner.nextInt();
		System.out.println("Oma valinta tehty");
	}
	
}
