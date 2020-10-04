package com.bridgelabz.lambdaexpression;

public class LambdaExpression {
	public static class Main {
		@FunctionalInterface
		interface IMathFunction {
			int calculate(int a, int b);
			static void printResult(int a, int b, String function, IMathFunction fobj ) {
				System.out.println("Result of "+function+"is "+fobj.calculate(a, b));
			}
		}
		
		public static int add(int a, int b) {
	            return Math.addExact(a, b);
	        }
		
		public static void main(String[] args) {
			System.out.println("Welcome to the Lambda Math Operation Problem ");
			
			IMathFunction add = (int a, int b) -> {
	            return a + b;
	        };
	        
			IMathFunction add1 = Integer::sum; // directly call method reference
			IMathFunction addition= (x, y) -> x + y;
			IMathFunction subtraction= (x, y) -> x - y;
			IMathFunction multiply= (x, y) -> x * y;
			IMathFunction divide= (x, y) -> x / y;


			System.out.println("Addition is "+ addition.calculate(6, 3));
			System.out.println("Multiplication is "+ multiply.calculate(6, 3));
			System.out.println("Division is "+ divide.calculate(6, 3));
			System.out.println("Subtration  is "+ subtraction.calculate(6, 3));

			IMathFunction.printResult(6, 3, "Addition", addition);

		}


	}

}

