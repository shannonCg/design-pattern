package ch6.decorator;

/*
 * 裝飾模式：ConcreteDecorator
 */
public class LeatherShoes extends Finery{
	@Override
	public void show(){
		System.out.println("皮鞋");
		super.show();
	}
}
