import java.util.Scanner;

public class ArrayTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열(Array)
		// 만약에 한 반의 학생이 30명일 때
		// 각 학생의 국어 성적을 저장하고 싶다.
		// 어떻게 하면 될까?
		int score[] = new int[30];
		System.out.println("성적 입력 프로그램");
		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++) {
			System.out.print((i+1) + " 번째 학생 성적: ");
			score[i] = scan.nextInt();
		}
		
		int sum = 0;
		for(int j = 0; j < 5; j++) {
			sum += score[j];
		}
		for(int s : score) {//향상된 for문
			sum += s;
		}
		
		System.out.println("총점은 " + sum);
		
		
//		score[0] = 80;
//		score[10] = 93;
//		
//		System.out.println(score[1]);
//		System.out.println(score[10]);

	}

}
