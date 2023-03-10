package calculator;

import calculator.operations.Addition;
import calculator.operations.Division;
import calculator.operations.Multiplication;
import calculator.operations.Operation;
import calculator.operations.Subtraction;
import calculator.utils.InputUtils;

public class Calculator {
	public static void main(String[] args) {
		double num1 = InputUtils.readDouble("Enter the first number: ");
		double num2 = InputUtils.readDouble("Enter the second number: ");

		Operation[] operations = { new Addition(), new Subtraction(), new Multiplication(), new Division() };

		for (Operation op : operations) {
			double result = op.performOperation(num1, num2);
			System.out.printf("%f %s %f = %f\n", num1, op.getSymbol(), num2, result);
		}
	}
}
