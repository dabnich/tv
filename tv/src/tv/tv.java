package tv;

public class tv {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Telewizor odbiornik1 = new Telewizor();
		Telewizor odbiornik2 = new Telewizor();
		
		//odbiornik1.Wlacz();
		odbiornik1.ZwiekszGlosnosc(10);
		odbiornik1.UstawProgram(26);
		
		odbiornik2.Wlacz();
		odbiornik2.ZwiekszGlosnosc(5);
		odbiornik2.UstawProgram(30);
		odbiornik2.Wylacz();
		odbiornik1.Dzialanie();
		odbiornik2.Dzialanie();
		
		
	}

}
