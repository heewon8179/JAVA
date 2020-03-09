import java.util.Scanner;

public class OperationTest06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//문제 -1이 입력될 때까지 반복적으로
		//점수를 입력받아서 평균을 출력하는 프로그램
		Scanner scan = new Scanner(System.in);
		int num = 0;
		int sum = 0;
		int cnt = -1;
		double avg = 0.0f;
//		num = scan.nextInt();
//		
//		
//		while(num != -1) {
//			
//			sum += num;
//			cnt++;
//			num = scan.nextInt();
//			
//			
//		}
		
		do {
			sum += num;
			cnt++;
			num = scan.nextInt();
			
		}while(num != -1);
		
		avg = (double)sum/cnt; //정수 -> 실수 변환
		System.out.println(avg);
		
		

	}

}
