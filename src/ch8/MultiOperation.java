package ch8;

public class MultiOperation extends Operation{
	
	@Override
	public double getResult(){
		double result = 0;
		result = numA * numB;
		return result;
	}
}
