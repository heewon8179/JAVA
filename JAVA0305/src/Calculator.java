import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		//���� ����
		int num1 = 0, num2 = 0, result = 0;
		String op = null; //������(+,-,*,/,%)
		
		//Ÿ��Ʋ ���
		System.out.println("*** ���� ***");
		System.out.print("�� 1 : ");
		num1 = scan.nextInt();
		System.out.print("�� 2 : ");
		num2 = scan.nextInt();
		System.out.print("���� : ");
		//���ڿ� �Է� ó��
		op = scan.next(); //scan.nextLine();
		
		//switch -> if��ȯ
		//���� ���� : ���ڿ��� ��
		//if���� ���ڿ��� ���Ҷ� a == "b" �����δ� �ȵȴ�.
		//a.equals("b"); �� �Է��� �������
		// "==" �� �ּҰ��� ���ϴ°��̰�
		// equals �� ����� ���� ��ü�� ���ϴ°��̴�.
		//1�� : ���ڿ����� .equals("�񱳹��ڿ�");
		//2�� : ���ڿ�����1.equals(�񱳹��ڿ�����2);
		//3�� : "�񱳹��ڿ�".equals(���ڿ�����);
		
		if(op.equals("+")) {
			result = num1 + num2;
		} else if(op.equals("-")) {
			result = num1 - num2;
		} else if(op.equals("*")) {
			result = num1 * num2;
		} else if(op.equals("/")) {
			result = num1 / num2;
		} else if(op.equals("%")) {
			result = num1 % num2;
		} else {
			result = 0;
			System.out.println("�߸��� �������Դϴ�.");
		}
		//�Է��� ���� ���ڷ� �б�.
		/*switch(op) {
		case "+" : 
			result = num1 + num2;
			break;
		case "-" : 
			result = num1 - num2;
			break;
		case "*" : 
			result = num1 * num2;
			break;
		case "/" : 
			result = num1 / num2;
			break;
		case "%" : 
			result = num1 % num2;
			break;
		default:
			System.out.println("�߸��� �������Դϴ�");
			result = 0;
		}//switch ��*/
		
		System.out.println("��� ��� : " + result);
	}//main ��

}//class ��
