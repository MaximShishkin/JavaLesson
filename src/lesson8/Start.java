package lesson8;

public class Start {

	public static void main(String[] args) {
		// TODO Автоматически созданная заглушка метода
		Animals dog = new Animals("КУЗЯ");
		dog.dlina=1.5;
		dog.rost=0.5;
		dog.ves=25;
		dog.vid="мутант";
		dog.go(dog.ves);
		
		Animals cat = new Animals("ГАВ");
		cat.dlina=0.4;
		cat.rost=0.2;
		cat.ves=8;
		cat.vid="Невская макскарадная";
		cat.go(cat.ves);
		
		System.out.println("У меня есть домашние животные их зовут " + dog.clichka+" и " + cat.clichka);
		
		System.out.println("Вес " + dog.clichka+" больше " + cat.clichka + " на " +(dog.ves-cat.ves));
	
		akula shark = new akula("Большая белая акула");
		shark.dlina=5;
		shark.rost=1;
		shark.ves=950;
		shark.vid="Мегаладон";
		shark.kolvop=5;
		shark.kolvoz=6000;
		shark.mestoo = "Индийский океан";
		
		System.out.println("Вес " + shark.clichka+" больше " + cat.clichka + " на " +(shark.ves-cat.ves));
		
		System.out.println("У меня есть домашние животные их зовут " + dog.clichka+" и " + cat.clichka + ", а так же есть маленький пиитомец, которого зовут " + shark.clichka );
	}
}
