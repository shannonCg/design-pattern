package ch6.decorator;
/*
 * 裝飾模式：ConcreteComponent
 */
public class Person {
	private String name;
	
	public Person(){
	}

	public Person(String name) {
		this.name = name;
	}

	public void show() {
		System.out.println("裝扮的" + name);
	}
}
