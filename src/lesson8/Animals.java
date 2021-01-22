package lesson8;

public class Animals {
	double ves; // вес
	String vid; // вид
	double rost; // рост в холке
	double dlina; // длина от кончика носа до хвоста 
	String clichka; // кличка
	
	Animals(String name)
	{
		clichka=name;
	}
	
	void go (double x)
	{
		if (x>10)
		{
			System.out.println("ћожет быть хватит кормить это животное по имени "+clichka);
		}
		else
		{
			System.out.println("ќй, да он худой, может быть отвести "+clichka+" к бабушке");
		}
	}
}
