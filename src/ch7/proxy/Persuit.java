package ch7.proxy;

/*
 * 代理模式:為代理類別所操控的實體物件
 */
public class Persuit implements IGiveGift {
	private SchoolGirl mm;
	
	public Persuit(SchoolGirl mm){
		this.mm = mm;
	}
		
	@Override
	public void giveDolls() {
		System.out.println(mm.getName() + " 送你洋娃娃");
	}

	@Override
	public void giveFlowers() {
		System.out.println(mm.getName() + " 送你鮮花");
	}

	@Override
	public void giveChocolate() {
		System.out.println(mm.getName() + " 送你巧克力");
	}

}
