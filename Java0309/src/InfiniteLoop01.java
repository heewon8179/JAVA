import java.util.Scanner;

public class InfiniteLoop01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int menu = 0;
		
		System.out.println("메뉴 출력");
		
		for(;;) { //조건을 따로 설정하지않겠다 -> 계속 실행하겠다.
			System.out.println("1. 입력하기");
			System.out.println("2. 불러오기");
			System.out.println("3. 저장하기");
			System.out.println("4. 출력하기");
			System.out.println("5. 종료하기");
			System.out.print("입력 > ");
			menu = scan.nextInt();
			
			if(menu == 5) {
				break; //반복문을 종료해라!
			}
			
			switch(menu) {
			case 1:
				System.out.println("입력하기 처리");
				break;
			case 2:
				System.out.println("불러오기 처리");
				break;
			case 3:
				System.out.println("저장하기 처리");
				break;
			case 4:
				System.out.println("출력하기 처리");
				break;
			default:
				System.out.println("입력오류!!");
				
			}
			
		}

	}

}
