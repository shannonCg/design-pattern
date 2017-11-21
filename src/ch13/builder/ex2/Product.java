package ch13.builder.ex2;

import java.util.ArrayList;
import java.util.List;

public class Product {
	private List<String> parts = new ArrayList<>();
	
	public void add(String part){
		parts.add(part);
	}
	
	public void show(){
		System.out.println("開始建立產品----");
		parts.forEach(System.out::println);
	}
}
