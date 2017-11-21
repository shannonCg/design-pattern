package ch8.factoryMethod;

import ch8.MinusOperation;
import ch8.Operation;

public class MinusFactory implements OperationFactory {

	@Override
	public Operation createOperation() {
		return new MinusOperation();
	}

}
