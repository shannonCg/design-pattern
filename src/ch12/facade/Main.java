package ch12.facade;
/*
 * 外觀模式(Facade): 提供一個第三方的界面來操作某一子系統內類別或界面的功能，讓外界只需要調用此界面上經過包裝後的操作即可，降低和外界的耦合
 */
public class Main {

	public static void main(String[] args) {
		
		Fund jijin = new Fund();
		
		//客戶端只需要知道如何進行基金的買賣，而實際去買賣哪些股票、房地產等，則讓基金去實際操作執行
		jijin.buyFund();
		jijin.sellFund();
	}

}
