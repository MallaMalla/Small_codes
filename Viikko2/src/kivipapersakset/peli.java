package kivipapersakset;

import java.util.Scanner;

public class peli 
{

	public static void main(String[] args) 
	{ 
		Scanner scanner = new Scanner(System.in);
		
		int Computer=0;
		int Player=0;
		int newGame=1;
		
		Player player1 = new Player();
		Player player2 = new Player();
		
		player1.setName("Malla");
		player2.setName(player2.RandomName());
		
		System.out.println("Tervetuloa pelaamaan kivipaperisaksia, " + player1.getName() + " ja " + player2.getName() + " !");
		
		while(newGame==1)
		{
			player1.makeMove();
			player2.randomMove();
			System.out.println("Valinnat olivat: " + player2.getName() + " " + player2.rMove + " ja " + player1.getName() + " " + player1.mMove);
		
				if(player1.mMove == player2.rMove)
				{
					System.out.println("Tasapeli!");
				}
    
				else
				{
					switch(player1.mMove)
					{
						case 1:
							if(player2.rMove==2)
								{
									System.out.println("Hävisit!");
									Computer++;
								}
							else
								{
									System.out.println("Voitit!");
									Player++;
								}
							break;
						case 2:
							if(player2.rMove==3)
								{
									System.out.println("Hävisit!");
									Computer++;
								}
							else
								{
									System.out.println("Voitit!");
									Player++;
								}
								break;
						case 3:
							if(player2.rMove==1)
								{
									System.out.println("Hävisit!");
									Player++;
								}
							else
								{
									System.out.println("Voitit!");
									Computer++;
								}
								break;
					}
				}
					System.out.println("Paina 1 jos haluat pelata uudelleen, 2 jos haluat lopettaa");
					newGame = scanner.nextInt();
		
		}	
		
		if(newGame==2)
		{	
			System.out.println(player1.getName() + " voitti "+ Player +" kertaa.");
			System.out.println(player2.getName() + " voitti "+ Computer +" kertaa.");	
		}
	}
}
	



