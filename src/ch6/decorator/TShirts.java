package ch6.decorator;

/*
 * 裝飾模式：ConcreteDecorator
 */
public class TShirts extends Finery {
	@Override
	public void show(){
		System.out.println("大T恤");
		super.show();
	}
}
