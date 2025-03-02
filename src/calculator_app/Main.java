package calculator_app;

public class Main {

	public static void main(String[] args) {
		calculatorBase calculator = new calculatorBase();
		System.out.println(calculator.addition(10, 20));
		System.out.println(calculator.subtraction(20, 10));

		System.out.println(calculator.multiplacation(5, 6));
		System.out.println(calculator.division(10, 0));
		System.out.println(calculator.division(10, 3));


	}

}
