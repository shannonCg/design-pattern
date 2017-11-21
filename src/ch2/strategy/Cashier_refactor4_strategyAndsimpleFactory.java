package ch2.strategy;

public class Cashier_refactor4_strategyAndsimpleFactory {
	private Double total = 0.0;

	public void simpleCalcul(String price, String number, String type) {
		CashContext_combineSimpleFactory cashContext = new CashContext_combineSimpleFactory(type);
		Double totalPrices = cashContext.getResult(Double.valueOf(price)) * Double.valueOf(number);
		total += totalPrices;
		showInfo(price, number, total.toString());
	}

	public void showInfo(String price, String number, String total) {
		System.out.println("單價：" + price + "\n數量：" + number + "\n合計：" + total);
	}

	public static void main(String[] args) {
		Cashier_refactor4_strategyAndsimpleFactory cashier = new Cashier_refactor4_strategyAndsimpleFactory();
		cashier.simpleCalcul("500", "2", "滿300送100");
	}
}
