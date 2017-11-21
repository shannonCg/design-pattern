package ch2.strategy;

import ch2.CashSuper;

/*
 * 策略模式：根據參考到不同的現金收費物件(依據CashSuper參考到的物件),得到不同的現金計算結果
 */
public class CashContext {
	private CashSuper cashSuper;
	
	public CashContext(CashSuper cashSuper){
		this.cashSuper = cashSuper; 
	}
	
//	用一個ConcreteStrategy(getResult)來配置,維護一個對Strage(CashSuper)物件的參考
	public double getResult(double money){
		return cashSuper.acceptCash(money);
	}
}
