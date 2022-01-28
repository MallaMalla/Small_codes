package laskin3;

import java.io.FileWriter;
import java.io.IOException;

public class Tallenna 
{

	Peruslasku basic = new Peruslasku();
	Erikoislaskuluokka special = new Erikoislaskuluokka();
	
	public void basictallennus()
	{
		FileWriter writer;
			try 
			{
					String tulos = String.valueOf(basic.getSumma());
					writer = new FileWriter("tallennus.txt", true);
					writer.write("\n" + tulos);
					writer.close();
			}	
			catch (IOException e) 
			{
				e.printStackTrace();
			}
	}

	public void specialtallennus()
	{
		FileWriter writer;
			try 
			{
					writer = new FileWriter("tallennus.txt", true);
					writer.write(Double.toString(special.getSumma()));
					writer.close();
			}	
			catch (IOException e) 
			{
				e.printStackTrace();
			}
	}
}
	
