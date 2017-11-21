package ch7.proxy;

/*
 * 代理模式:代理類別
 */
public class Proxy implements IGiveGift {
	private Persuit gg;
	
	public Proxy(SchoolGirl mm){
		gg = new Persuit(mm);
	}
	
	@Override
	public void giveDolls() {
		gg.giveDolls();
	}

	@Override
	public void giveFlowers() {
		gg.giveFlowers();
	}

	@Override
	public void giveChocolate() {
		gg.giveChocolate();
	}

}
