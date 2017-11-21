package ch2;     

/*
 *  正常收費
 */
public class CashNormal implements CashSuper {
	
	/*
	 * Get the cash
	 * @param original money
	 * @return unchanged money
	 */
	@Override
	public double acceptCash(double money) {
		
		return money;
	}

}
