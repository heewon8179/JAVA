import java.util.Scanner;

public class ControlTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���ǹ� if
		//���� true��� ó��. false��� �Ѿ.
		// if(���ǽ�)
		// 		ó������(��ɹ�);
		//�Է°��� ¦������ �Ǵ��ϴ� ���α׷�
		Scanner scan = new Scanner(System.in);
		/*int num = 0;
		System.out.print("���� �Է� : ");
		num = scan.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("¦���Դϴ�.");
		} else if(num <= 0){
			System.out.println("�ڿ����� �ƴմϴ�.");
		} else {
			System.out.println("Ȧ���Դϴ�.");
		}*/
		
		//���� ��ȯ ���α׷�
		//���� -> ����
		//90�� �̻� : A
		//80�� �̻� : B
		//70�� �̻� : C
		//60�� �̻� : D
		//������ : F
		System.out.print("������ : ");
		int score = scan.nextInt();
		String grade = null;
		
		
		switch(score/10) {
		case 9:
			if(score%10 > 5) {
				grade = "A+";
			} else {
				grade = "A0";
			}
			break;
		case 8:
			if(score%10 > 5) {
				grade = "B+";
			} else {
				grade = "B0";
			}
			break;
		case 7:
			if(score%10 > 5) {
				grade = "C+";
			} else {
				grade = "C0";
			}
			break;
		case 6:
			if(score%10 > 5) {
				grade = "D+";
			} else {
				grade = "D0";
			}
			break;
		
		default:
			grade = "F";
				
		}
		System.out.println(grade);
		/*
		
		if(score >= 90) {
			if(score >= 95) {
				grade = "A+";
			}
			else {
				grade = "A0";
			}
		} else if(score >= 80 && score < 90) {
			if(score >= 85) {
				grade = "B+";
			}
			else {
				grade = "B0";
			}
		} else if(score >= 70 && score < 80) {
			if(score >= 75) {
				grade = "C+";
			}
			else {
				grade = "C0";
			}
		} else if(score >= 60 && score < 70) {
			if(score >= 65) {
				grade = "D+";
			}
			else {
				grade = "";
			}
		} else {
			grade = "F";
		}
		System.out.println("������ " + grade);
		
		System.out.println("�����մϴ�.");*/
	}

}
