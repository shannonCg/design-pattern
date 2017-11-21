package ch2.simpleFactory;

import ch2.CashNormal;
import ch2.CashRebate;
import ch2.CashReturn;
import ch2.CashSuper;

/*
 * 簡單工廠模式:根據不同現金收取方式(正常,打折,紅利),取得對應的現金收費物件
 */
public class CashFactory {
	public static CashSuper createCashAccept(String type){
		CashSuper cs = null;
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
		return cs;
	}
}
