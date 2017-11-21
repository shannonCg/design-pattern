package ch6.decorator;

public class PersonAppearence {

	public static void main(String[] args) {
		Person person = new Person("小菜");
		
		System.out.println("第一種裝扮：");
		
		Sneakers sneakers = new Sneakers();
		BigTrouser bigTrouser = new BigTrouser();
		TShirts tShirts = new TShirts();
		sneakers.decorate(person);
		bigTrouser.decorate(sneakers);
		tShirts.decorate(bigTrouser);
		tShirts.show();
		
		System.out.println("\n第二種裝扮：");
		
		LeatherShoes leatherShoes = new LeatherShoes();
		Tie tie = new Tie();
		Suit suit = new Suit();
		leatherShoes.decorate(person);
		tie.decorate(leatherShoes);
		suit.decorate(tie);
		suit.show();
		
		System.out.println("\n第三種裝扮：");
		
		sneakers.decorate(person);
		leatherShoes.decorate(sneakers);
		bigTrouser.decorate(leatherShoes);
		tie.decorate(bigTrouser);
		tie.show();
		
	}

}
