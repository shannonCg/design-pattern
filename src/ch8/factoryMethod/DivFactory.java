package ch8.factoryMethod;

import ch8.DivOperation;
import ch8.Operation;

public class DivFactory implements OperationFactory {

	@Override
	public Operation createOperation() {
		return new DivOperation();
	}

}
