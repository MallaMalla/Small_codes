import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.util.Scanner;

public class jasenrekisteri 
{

	public static final String PAAVALIKKO = "päävalikko";
    public static final String UUSI = "uusi";
    public static final String TULOSTA = "tulosta";
    public static final String LOPETA = "lopeta";
    
	public static void main(String[] args) throws IOException 
	{
	try 
	{
        String valinta = "";
        
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;
	
        while (isRunning) 
        {
        	System.out.println("Syötä 1 jos haluat lisätä uuden jäsenen rekisteriin, tai 2 jos haluat tulostaa koko jäsenrekisterin sisällön.");
            int a = scanner.nextInt(); 
            if (a == 1) valinta = UUSI;
            if (a == 2) valinta = TULOSTA;

            while (valinta.equals(UUSI)) 
            {
            	uusijasen();

    			System.out.println("Tallennus onnistui. Syötä 1 jos haluat talentaa toisen jäsenen, 2 jos haluat palata päävalikkoon, tai 3 jos haluat lopettaa ohjelman");
                a = scanner.nextInt();
                if (a == 1) valinta = UUSI;
                if (a == 2) valinta = PAAVALIKKO;
                if (a == 3) valinta = LOPETA;
            }
        
            if (valinta.equals(TULOSTA)) 
            {
            	tulostus();
            		
            	System.out.println("Syötä 1 jos haluat palata päävalikkoon tai 2 jos haluat lopettaa ohjelman");
                a = scanner.nextInt();
                if (a == 1) valinta = PAAVALIKKO;
                if (a == 2) valinta = LOPETA;
            }

            if (valinta.equals(LOPETA)) 
            {
                isRunning = false;
                System.out.println("Ohjelma on lopetettu");
            }
        }
    }
        catch(InputMismatchException e)
    	{
        	System.out.print(e.getMessage());
    	}
    }
	
	public static void uusijasen() throws IOException
	{	
		BufferedWriter writer = new BufferedWriter(new FileWriter("jasenrekisteri.txt", true));
		Scanner scanner = new Scanner(System.in);
		System.out.println("Anna etunimi, sukunimi ja puhelinnumero");
		String answer = scanner.nextLine();
		writer.write("\n"+answer);
		writer.close();
	}
	
	public static void tulostus() throws FileNotFoundException
	{
		File file = new File("jasenrekisteri.txt");
    	Scanner scan = new Scanner(file);
    
    	while(scan.hasNextLine()) 
		{
			String data = scan.nextLine();
    		System.out.println(data);
		}
    		scan.close();
	}
}


