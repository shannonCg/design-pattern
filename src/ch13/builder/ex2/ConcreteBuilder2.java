package ch13.builder.ex2;

public class ConcreteBuilder2 implements Builder {
	
	private Product product = new Product();
	
	@Override
	public void buildPartA() {
		product.add("零件X");
	}

	@Override
	public void buildPartB() {
		product.add("零件Y");
	}

	@Override
	public Product getResult() {
		return product;
	}

}
