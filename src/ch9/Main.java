package ch9;

public class Main {

	public static void main(String[] args) {
		Resume a = new Resume("大鳥");
		a.setPersonalInfo("男", "29");
		a.setWorkExperience("1998-2000", "XX公司");
		
		Resume b = new Resume("大鳥");
		b.setPersonalInfo("男", "29");
		b.setWorkExperience("1998-2000", "XX公司");
		
		Resume c = new Resume("大鳥");
		c.setPersonalInfo("男", "29");
		c.setWorkExperience("1998-2000", "XX公司");
		
		a.display();
		b.display();
		c.display();
	}

}
