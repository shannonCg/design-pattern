/*普通計算*/
package ch2;

public class Cashier_original {
	private Double total = 0.0;
	
	public void simpleCalcul(String price, String number){
		Double totalPrices = Double.valueOf(price)*Double.valueOf(number);
		total += totalPrices;
		showInfo(price, number, total.toString());
	}
	
	public void showInfo(String price, String number, String total){
		System.out.println("單價："+price+"\n數量："+number+"\n合計："+total);
	}

	public static void main(String[] args) {
		Cashier_original cashier = new Cashier_original();
		cashier.simpleCalcul("100", "2");
	}

}
