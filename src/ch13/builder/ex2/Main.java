package ch13.builder.ex2;

public class Main {
	public static void main(String[] args) {

		Director director = new Director();
		ConcreteBuilder1 builder1 = new ConcreteBuilder1();
		ConcreteBuilder2 builder2 = new ConcreteBuilder2();
		
		director.construct(builder1);
		builder1.getResult().show();
		
		director.construct(builder2);
		builder2.getResult().show();
		
		}
}
