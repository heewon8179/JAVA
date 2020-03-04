import java.util.Scanner;

public class ControlTest02 {

	public static void main(String[] args) {
		
		// 조건문 switch
		// 다중 분기를 위해 태어난 제어문.
		// case, default
		// 기타 제어문인 break.
		Scanner scan = new Scanner(System.in);
		
		//011 - sk, 016 - kt, 019 - LG
		
		System.out.print("번호 입력 : ");
		int num = scan.nextInt();
		
		switch(num) {
		case 11 : 
			System.out.println("SK입니다.");
			break;
		case 16:
			System.out.println("KT입니다.");
			break;
		case 19:
			System.out.println("LG입니다.");
			break; //한 case만 실행하게하는 역할
		default:
			System.out.println("기타 ");
		}
	}

}
