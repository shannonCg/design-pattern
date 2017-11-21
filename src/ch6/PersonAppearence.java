package ch6;

public class PersonAppearence {

	public static void main(String[] args) {
		Person p = new Person("小菜");
		
		System.out.println("第一種裝扮：");
		
		p.wearTShirts();
		p.wearBigTrouser();
		p.wearSneakers();
		p.show();
		
		System.out.println("\n第二種裝扮：");
		
		p.wearSuit();
		p.wearTie();
		p.wearLeatherShoes();
		p.show();
	}

}
