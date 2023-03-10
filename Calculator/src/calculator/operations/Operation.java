package calculator.operations;

public interface Operation {
	double performOperation(double num1, double num2);

	String getSymbol();
}
