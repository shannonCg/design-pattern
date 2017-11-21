package ch6.decorator;

/*
 * 裝飾模式：ConcreteDecorator
 */
public class BigTrouser extends Finery {
	@Override
	public void show(){
		System.out.println("垮褲");
		super.show();
	}
}
