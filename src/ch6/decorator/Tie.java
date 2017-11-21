package ch6.decorator;

/*
 * 裝飾模式：ConcreteDecorator
 */
public class Tie extends Finery {
	@Override
	public void show(){
		System.out.println("領帶");
		super.show();
	}
}
