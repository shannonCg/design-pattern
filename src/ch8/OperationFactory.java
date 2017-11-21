package ch8;

/*
 * 簡單工廠模式
 */

public class OperationFactory {
	
	public static Operation createOperate(String operate){
		Operation oper = null;
		
		switch(operate){
		case "+":
			oper = new AddOperation();
			break;
		case "-":
			oper = new MinusOperation();
			break;
		case "*":
			oper = new MultiOperation();
			break;
		case "/":
			oper = new DivOperation();
			break;
		}
		
		return oper;
	}
}
