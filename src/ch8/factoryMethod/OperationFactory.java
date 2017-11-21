package ch8.factoryMethod;

import ch8.Operation;

/*
 * 工廠模式
 */

public interface OperationFactory {
	Operation createOperation();
}
