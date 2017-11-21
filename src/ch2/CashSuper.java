package ch2;

/*
 * 現金收取方式界面
 */
public interface CashSuper {
	/*
	 * Get the cash
	 * @param money(original price)
	 * @return changed money(final price)
	 */
	public double acceptCash(double money);
}
