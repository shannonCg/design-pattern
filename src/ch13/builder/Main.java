package ch13.builder;

public class Main {

	public static void main(String[] args) {
		
		PersonDirector pdThin = new PersonDirector(new ThinPerson());
		pdThin.createPerson();
		
		System.out.println("--------------------------------------");
		
		PersonDirector pdFat = new PersonDirector(new FatPerson());
		pdFat.createPerson();
	}

}
