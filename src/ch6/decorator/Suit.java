package ch6.decorator;

/*
 * 裝飾模式：ConcreteDecorator
 */
public class Suit extends Finery {
	@Override
	public void show(){
		System.out.println("西裝");
		super.show();
	}
}
