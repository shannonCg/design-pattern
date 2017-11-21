package ch2.simpleFactory;

import ch2.CashSuper;

public class Cashier_refactor2_simpleFactory {
	private Double total = 0.0;
	
	public void simpleCalcul(String price, String number, String type){
		CashSuper cs = CashFactory.createCashAccept(type);
		Double totalPrices = cs.acceptCash(Double.valueOf(price))*Double.valueOf(number);
		total += totalPrices;
		showInfo(price, number, total.toString());
	}
	
	public void showInfo(String price, String number, String total){
		System.out.println("單價："+price+"\n數量："+number+"\n合計："+total);
	}

	public static void main(String[] args) {
		Cashier_refactor2_simpleFactory cashier = new Cashier_refactor2_simpleFactory();
		cashier.simpleCalcul("300", "2", "滿300送100");
	}
}
