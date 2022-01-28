package laskin3;

public class Erikoislaskuluokka extends Laskin 
{
	public void SuorakulmioPA()
	{
		setSumma(getLuku1() * getLuku2());
		System.out.println("Pinta-ala on " + getSumma());
	}
	
	public void suorakulmioTilavuus()
	{
		setSumma(getLuku1() * getLuku2() * getLuku3());
		System.out.println("Tilavuus on " + getSumma());
	}
	
	public void suorakulmainenkolmioPA()
	{
		setSumma(getLuku1() * getLuku2() / 2);
		System.out.println("Kolmion pinta-ala on " + getSumma());
	}
}
