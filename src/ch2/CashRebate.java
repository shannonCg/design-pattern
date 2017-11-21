package ch2;
/*
 * 打折收費,建立物件時輸入折扣率(例如：八折為0.8)
 */
public class CashRebate implements CashSuper {
	
	private double moneyRebate = 0.0;
	
	public CashRebate(String moneyRebate){
		this.moneyRebate = Double.valueOf(moneyRebate);
	}
	
	/*
	 * Get the cash
	 * @param money(original price)
	 * @return changed money(after discounting)
	 */
	@Override
	public double acceptCash(double money) {
		return money*moneyRebate;
	}

}
