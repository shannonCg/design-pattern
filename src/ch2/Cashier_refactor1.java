/*增加打折商品條件*/
package ch2;

import static java.lang.Double.valueOf;

import java.util.*;

public class Cashier_refactor1 {
	private Double total = 0.0;
	private List<String> discount = Arrays.asList("正常收費", "打八折", "打七折", "打五折");

	public void simpleCalcul(String price, String number, String chooseDiscount) {
		Double totalPrices = 0.0;
		int index = discount.indexOf(chooseDiscount);
		switch (index) {
		case 0:
			totalPrices = Double.valueOf(price) * Double.valueOf(number);
			break;
		case 1:
			totalPrices = Double.valueOf(price) * Double.valueOf(number) * 0.8;
			break;
		case 2:
			totalPrices = Double.valueOf(price) * Double.valueOf(number) * 0.7;
			break;
		case 3:
			totalPrices = valueOf(price) * Double.valueOf(number) * 0.5;
			break;
		}
		total += totalPrices;
		showInfo(price, number, total.toString());
	}

	public void showInfo(String price, String number, String total) {
		System.out.println("單價：" + price + "\n數量：" + number + "\n合計：" + total);
	}

	public static void main(String[] args) {
		Cashier_refactor1 cashier = new Cashier_refactor1();
		cashier.simpleCalcul("100", "2", "打五折");
	}

}
