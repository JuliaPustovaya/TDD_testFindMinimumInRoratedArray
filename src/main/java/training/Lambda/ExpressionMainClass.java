package training.Lambda;

/*
It's possible to pass the reference on static/non-static methods like a param;
 */
public class ExpressionMainClass {
	private static int sum(int[] numbers, InterfaceExpression func) {
		int result = 0;
		for (int i : numbers) {
			if (func.checkValue(i)) {
				result += i;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int arr[] = new int[] {10, 15, 12, 9, -8, 7, -9};
		ExpressionHelper expressionHelper = new ExpressionHelper();
		InterfaceExpression interfaceExpression = ExpressionHelper::isPositive;
		InterfaceExpression interfaceExpression1 = expressionHelper::isDividedhTree;
		System.out.println("First static  method: " + sum(arr, interfaceExpression));
		System.out.println("Second static method:" + sum(arr, ExpressionHelper::isSimple));
		System.out.println("Non-static method  " + sum(arr, interfaceExpression1));
	}
}
