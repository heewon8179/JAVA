import java.util.Scanner;

public class ArrayTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �迭(Array)
		// ���࿡ �� ���� �л��� 30���� ��
		// �� �л��� ���� ������ �����ϰ� �ʹ�.
		// ��� �ϸ� �ɱ�?
		int score[] = new int[30];
		System.out.println("���� �Է� ���α׷�");
		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++) {
			System.out.print((i+1) + " ��° �л� ����: ");
			score[i] = scan.nextInt();
		}
		
		int sum = 0;
		for(int j = 0; j < 5; j++) {
			sum += score[j];
		}
		for(int s : score) {//���� for��
			sum += s;
		}
		
		System.out.println("������ " + sum);
		
		
//		score[0] = 80;
//		score[10] = 93;
//		
//		System.out.println(score[1]);
//		System.out.println(score[10]);

	}

}
