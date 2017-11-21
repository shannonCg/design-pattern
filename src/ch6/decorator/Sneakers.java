package ch6.decorator;

/*
 * 裝飾模式：ConcreteDecorator
 */
public class Sneakers extends Finery {
	@Override
	public void show(){
		System.out.println("破球鞋");
		super.show();
	}
}
