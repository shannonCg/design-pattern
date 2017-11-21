package ch2.strategy;

import ch2.CashNormal;
import ch2.CashRebate;
import ch2.CashReturn;

public class Cashier_refactor3_strategy {
	private Double total = 0.0;

	public void simpleCalcul(String price, String number, String type) {
		CashContext cashContext = null;
		switch(type){
		case "正常收費":
			cashContext = new CashContext(new CashNormal());
			break;
		case "滿300送100":
			cashContext = new CashContext(new CashReturn("300","100"));
			break;
		case "打8折":
			cashContext = new CashContext(new CashRebate("0.8"));
			break;
		}
		Double totalPrices = cashContext.getResult(Double.valueOf(price)) * Double.valueOf(number);
		total += totalPrices;
		showInfo(price, number, total.toString());
	}

	public void showInfo(String price, String number, String total) {
		System.out.println("單價：" + price + "\n數量：" + number + "\n合計：" + total);
	}

	public static void main(String[] args) {
		Cashier_refactor3_strategy cashier = new Cashier_refactor3_strategy();
		cashier.simpleCalcul("500", "2", "滿300送100");
	}

}
