package ch8;

/*
 * 簡單工廠模式
 */

public class Main {
	
	public void printResult(double numA, double numB, String operator, double result){
		System.out.println(numA+" "+operator+" "+numB+" = "+result);
	}
	
	public static void main(String[] args) {
		Operation oper = OperationFactory.createOperate("/");
		oper.numA = 4;
		oper.numB = 3;
		
		Main main = new Main();
		try {
			main.printResult(oper.numA, oper.numB, "/", oper.getResult());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
