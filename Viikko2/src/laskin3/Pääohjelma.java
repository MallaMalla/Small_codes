package laskin3;

import java.util.Scanner;

public class P‰‰ohjelma {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		Peruslasku basic = new Peruslasku();
		Erikoislaskuluokka special = new Erikoislaskuluokka(); 
		Tallenna tallenna = new Tallenna();
		
		System.out.println("Haluatko laskea \n1) pluslaskun \n2) miinuslaskun \n3) kertolaskun \n4) jakolaskun \n5)"
				+ " suorakulmion pinta-alan \n6) suorakulmion tilavuuden \n7) suorakulmaisen kolmion pinta-alan");
		int choice = scanner.nextInt();

		if(choice < 5)
		{
		
			System.out.println("Anna ensimm‰inen luku");
			basic.setLuku1(scanner.nextDouble());
			System.out.println("Anna toinen luku");
			basic.setLuku2(scanner.nextDouble());
		
				switch(choice)
				{
					case 1:
							basic.laskeYhteen();
							break;
					case 2:
							basic.vahenna();
							break;
					case 3:
							basic.kerro();
							break;
					case 4:
							basic.jaa();
							break;
				}		
							tallenna.basictallennus();
		}
		else
		{
				System.out.println("Anna ensimm‰inen luku");
				special.setLuku1(scanner.nextDouble());
				System.out.println("Anna toinen luku");
				special.setLuku2(scanner.nextDouble());
				
				switch(choice)
				{
					case 5:
							special.SuorakulmioPA();
							break;
					case 6:
							System.out.println("Anna kolmas luku");
							special.setLuku3(scanner.nextDouble());
							special.suorakulmioTilavuus();
							break;
					case 7: 
							special.suorakulmainenkolmioPA();
							break;
				}
							tallenna.specialtallennus();
		}
	}
}
