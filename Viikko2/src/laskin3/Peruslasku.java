package laskin3;

public class Peruslasku extends Laskin 
{
	public void laskeYhteen()
	{
		setSumma(getLuku1() + getLuku2());
		System.out.println("Summa on " + getSumma());
	}
	
	public void vahenna()
	{
		setSumma(getLuku1() - getLuku2());
		System.out.println("Erotus on " + getSumma());
	}
	
	public void kerro()
	{
		setSumma(getLuku1() * getLuku2());
		System.out.println("Tulo on " + getSumma());
		return;
	}
	
	public void jaa()
	{
		setSumma(getLuku1() / getLuku2());
		System.out.println("Osam‰‰r‰ on " + getSumma());
	}
}
