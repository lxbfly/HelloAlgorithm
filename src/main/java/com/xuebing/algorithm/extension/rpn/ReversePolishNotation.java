package com.xuebing.algorithm.extension.rpn;

import java.util.Stack;

public class ReversePolishNotation {

	private static final String OPERATORS = "+-*/";

	public int calculateRPN(String[] operands) {
		int result = 0;
		int operandA = 0;
		int operandB = 0;
		int opIndex = -1;
		Stack<String> stack = new Stack<String>();
		for (String operand : operands) {
			if (!OPERATORS.contains(operand)) {
				stack.push(operand);
			} else {
				operandA = Integer.valueOf(stack.pop());
				operandB = Integer.valueOf(stack.pop());
				opIndex = OPERATORS.indexOf(operand);
				switch (opIndex) {
				case 0:
					stack.push(String.valueOf(operandA + operandB));
					break;
				case 1:
					stack.push(String.valueOf(operandB - operandA));
					break;
				case 2:
					stack.push(String.valueOf(operandA * operandB));
					break;
				case 3:
					stack.push(String.valueOf(operandB / operandA));
					break;
				}
			}
		}
		result = Integer.valueOf(stack.pop());
		return result;
	}

	public enum Operator {
		PLUS("+", 1), MINUS("-", 2), MULTIPLICATION("*", 3), DIVISION("/", 4);

		private String name;

		private Integer index;

		private Operator(String name, Integer index) {
			this.name = name;
			this.index = index;
		}

		@Override
		public String toString() {
			return this.name + ", " + this.index;
		}
	}

	public static void main(String[] args) {
		String[] rpnExpress = new String[] { "2", "1", "+", "3", "*" };
		ReversePolishNotation rpn = new ReversePolishNotation();
		System.out.println("Reverse Polish Notation Express Result = " + rpn.calculateRPN(rpnExpress));

		int sum = 1 + (3 * 4);
		System.out.println(sum);
	}
}
