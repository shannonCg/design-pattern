package ch8;

public class AddOperation extends Operation {

	@Override
	public double getResult(){
		double result = 0;
		result = numA + numB;
		return result;
	}
	
}
