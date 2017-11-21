package ch2;

/*
 * 紅利收費,物件建立時輸入紅利條件和紅利值(例如:滿300送100,則moneyCondition為300,moneyReturn為100)
 */
public class CashReturn implements CashSuper {
	private double moneyCondition = 0.0;
	private double moneyReturn = 0.0;
	
	public CashReturn(String moneyCondition, String moneyReturn){
		this.moneyCondition = Double.valueOf(moneyCondition);
		this.moneyReturn = Double.valueOf(moneyReturn);
	}
	
	/*
	 * Get the cash
	 * @param money(original price)
	 * @return changed money(after bonus)
	 */
	@Override
	public double acceptCash(double money) {
		double result = money;
		if(money >= moneyCondition)
			result = money - Math.floor(money/moneyCondition)*moneyReturn;
		return result;
	}

}
