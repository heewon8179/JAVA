package heewon;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int num1 = 0;
		int num2 = 0;
		int result = 0;
		
		System.out.println("���� 2���� �Է��ϼ���");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		
		result = num1 + num2;
		
		System.out.println("�μ��� ���� " + result + "�Դϴ�.");
		
	}

}
