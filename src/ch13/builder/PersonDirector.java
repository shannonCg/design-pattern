package ch13.builder;

public class PersonDirector {
	private PersonBuilder person;
	
	public PersonDirector(PersonBuilder person){
		this.person = person;
	}
	
	public void createPerson(){
		person.buildHead();
		person.buildBody();
		person.buildLeftHand();
		person.buildRightHand();
		person.buildLeftLeg();
		person.buildRightLeg();
	}
}
