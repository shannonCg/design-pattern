package ch8.factoryMethod;

import ch8.AddOperation;
import ch8.Operation;

public class AddFactory implements OperationFactory {

	@Override
	public Operation createOperation() {
		return new AddOperation();
	}

}
