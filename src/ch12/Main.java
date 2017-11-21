package ch12;

public class Main {

	public static void main(String[] args) {
		
		//客戶端需要了解股票、國債、房地產，才能進行這些項目的買賣行為
		Stock1 gu1 = new Stock1();
		Stock2 gu2 = new Stock2();
		Stock3 gu3 = new Stock3();
		NationalDebt1 nd1 = new NationalDebt1();
		Realty1 rt1 = new Realty1();
		
		//買進三個股票、一個國債、一個房地產
		gu1.buy();
		gu2.buy();
		gu3.buy();
		
		nd1.buy();
		rt1.buy();
		
		//賣出三個股票、一個國債、一個房地產
		gu1.sell();
		gu2.sell();
		gu3.sell();
		
		nd1.sell();
		rt1.sell();
	}

}
