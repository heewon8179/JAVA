import java.util.Scanner;

public class OperationTest06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���� -1�� �Էµ� ������ �ݺ�������
		//������ �Է¹޾Ƽ� ����� ����ϴ� ���α׷�
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
		
		avg = (double)sum/cnt; //���� -> �Ǽ� ��ȯ
		System.out.println(avg);
		
		

	}

}
