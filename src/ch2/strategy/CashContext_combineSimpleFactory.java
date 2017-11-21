package ch2.strategy;

import ch2.CashNormal;
import ch2.CashRebate;
import ch2.CashReturn;
import ch2.CashSuper;

/*
 * 策略＋簡單工廠: 根據不同現金收取方式(正常,打折,紅利),得到不同的現金計算結果
 */
public class CashContext_combineSimpleFactory {
	private CashSuper cs = null;
	
	public CashContext_combineSimpleFactory(String type){
		switch (type){
		case "正常收費":
			cs = new CashNormal();
			break;
		case "滿300送100":
			cs = new CashReturn("300","100");
			break;
		case "打8折":
			cs = new CashRebate("0.8");
			break;
		}
	}
	
	public double getResult(double money){
		return cs.acceptCash(money);
	}
}
