package ch13;

public class Main {

	public static void main(String[] args) {
		PersonThinBuilder thinPerson = new PersonThinBuilder();
		thinPerson.build();
		PersonFatBuilder fatPerson = new PersonFatBuilder();
		fatPerson.build();
	}

}
