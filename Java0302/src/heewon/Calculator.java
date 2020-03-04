package heewon;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int num1 = 0;
		int num2 = 0;
		int result = 0;
		
		System.out.println("숫자 2개를 입력하세요");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		
		result = num1 + num2;
		
		System.out.println("두수의 합은 " + result + "입니다.");
		
	}

}
