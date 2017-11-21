package ch8;

public class DivOperation extends Operation {
	
	@Override
	public double getResult() throws Exception{
		double result = 0;
		if (numB == 0){
			throw new Exception("除數不能為零");
		}
		result = numA / numB;
		return result;
	}
}
