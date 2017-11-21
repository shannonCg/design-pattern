package ch13.builder.ex2;

public class Director {
	
	public void construct(Builder builder){
		builder.buildPartA();
		builder.buildPartB();
	}
}
