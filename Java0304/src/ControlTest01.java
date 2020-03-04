import java.util.Scanner;

public class ControlTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//조건문 if
		//만약 true라면 처리. false라면 넘어감.
		// if(조건식)
		// 		처리문장(명령문);
		//입력값이 짝수인지 판단하는 프로그램
		Scanner scan = new Scanner(System.in);
		/*int num = 0;
		System.out.print("숫자 입력 : ");
		num = scan.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("짝수입니다.");
		} else if(num <= 0){
			System.out.println("자연수가 아닙니다.");
		} else {
			System.out.println("홀수입니다.");
		}*/
		
		//학점 변환 프로그램
		//성적 -> 학점
		//90점 이상 : A
		//80점 이상 : B
		//70점 이상 : C
		//60점 이상 : D
		//나머지 : F
		System.out.print("점수는 : ");
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
		System.out.println("학점은 " + grade);
		
		System.out.println("종료합니다.");*/
	}

}
