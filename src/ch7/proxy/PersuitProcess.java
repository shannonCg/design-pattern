package ch7.proxy;

public class PersuitProcess {

	public static void main(String[] args) {
		SchoolGirl jiaojiao = new SchoolGirl();
		jiaojiao.setName("嬌嬌");
		
		Proxy daili = new Proxy(jiaojiao);
		
		daili.giveDolls();
		daili.giveFlowers();
		daili.giveChocolate();
	}

}
