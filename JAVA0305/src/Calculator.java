import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		//변수 선언
		int num1 = 0, num2 = 0, result = 0;
		String op = null; //연산자(+,-,*,/,%)
		
		//타이틀 출력
		System.out.println("*** 계산기 ***");
		System.out.print("수 1 : ");
		num1 = scan.nextInt();
		System.out.print("수 2 : ");
		num2 = scan.nextInt();
		System.out.print("연산 : ");
		//문자열 입력 처리
		op = scan.next(); //scan.nextLine();
		
		//switch -> if변환
		//주의 사항 : 문자열의 비교
		//if문은 문자열을 비교할때 a == "b" 식으로는 안된다.
		//a.equals("b"); 로 입력을 해줘야함
		// "==" 은 주소값을 비교하는것이고
		// equals 는 대상의 내용 자체를 비교하는것이다.
		//1형 : 문자열변수 .equals("비교문자열");
		//2형 : 문자열변수1.equals(비교문자열변수2);
		//3형 : "비교문자열".equals(문자열변수);
		
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
			System.out.println("잘못된 연산자입니다.");
		}
		//입력한 연산 문자로 분기.
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
			System.out.println("잘못된 연산자입니다");
			result = 0;
		}//switch 끝*/
		
		System.out.println("계산 결과 : " + result);
	}//main 끝

}//class 끝
