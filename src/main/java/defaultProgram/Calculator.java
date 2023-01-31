package defaultProgram;

import java.util.Scanner;

public class Calculator {

	public static void calc() {
		int res = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the number:");
		int num1 = sc.nextInt();
		System.out.print("Please enter the operator:+=1,-=2,*=3,/=4:");
		int op1 = sc.nextInt();
		System.out.print("Please enter the number:");
		int num2 = sc.nextInt();
		if (op1 == 1) {
			res = num1 + num2;
		} else if (op1 == 2) {
			res = num1 - num2;
		} else if (op1 == 3) {
			res = num1 * num2;
		} else if (op1 == 4) {
			res = num1 / num2;
		}
		System.out.println("The result is:" + res);
		for (int i = 0; i < 4; i++) {
			System.out.print("Please enter the number:");
			int num = sc.nextInt();
			System.out.print("Please enter the operator:+=1,-=2,*=3,/=4:");
			int op = sc.nextInt();
			if (op == 1) {
				res = res + num;
			} else if (op == 2) {
				res = res - num;
			} else if (op == 3) {
				res = res * num;
			} else if (op == 4) {
				res = res / num;
			}
			System.out.println("The result is:" + res);
		}
	}

	public static void main(String[] args) {
		calc();

	}
}
