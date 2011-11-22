package tv;

public class Telewizor 
{

	int Glosnosc = 0;
	int Program = 0;
	boolean wlaczony = false;
	
	
	void SprawdzCzyWlaczony ()
	{
		if (wlaczony == false) 
		{ 
			Glosnosc = 0;
			Program = 0;
		}
	}
	
	void ZwiekszGlosnosc (int NewValue)
	{
		
		Glosnosc = Glosnosc + NewValue;
		SprawdzCzyWlaczony();
	}
	
	void ZmniejszGlosnosc (int NewValue)
	{
		Glosnosc = Glosnosc - NewValue;
		SprawdzCzyWlaczony();
	}

	void UstawProgram (int NewValue)
	{
		Program = NewValue;
		SprawdzCzyWlaczony();
	}
	
	void Wlacz() 
	{
		wlaczony = true;
	}
	
	void Wylacz() 
	{
		wlaczony = false;
	}

	void Dzialanie()
	{
		System.out.println(" Glosnosc = "+Glosnosc+" Program = "+Program+" Wlaczony = "+wlaczony);
	}

}

