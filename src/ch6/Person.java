package ch6;

public class Person {
	private String name;
	
	public Person(String name){
		this.name = name;
	}
	
	public void wearTShirts(){
		System.out.println("大T恤");
	}
	
	public void wearBigTrouser(){
		System.out.println("垮褲");
	}
	
	public void wearSneakers(){
		System.out.println("破球鞋");
	}
	
	public void wearSuit(){
		System.out.println("西裝");
	}
	
	public void wearTie(){
		System.out.println("領帶");
	}
	
	public void wearLeatherShoes(){
		System.out.println("皮鞋");
	}
	
	public void show(){
		System.out.println("裝扮的"+name);
	}
}
