import java.util.Scanner;

public class InfiniteLoop01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int menu = 0;
		
		System.out.println("�޴� ���");
		
		for(;;) { //������ ���� ���������ʰڴ� -> ��� �����ϰڴ�.
			System.out.println("1. �Է��ϱ�");
			System.out.println("2. �ҷ�����");
			System.out.println("3. �����ϱ�");
			System.out.println("4. ����ϱ�");
			System.out.println("5. �����ϱ�");
			System.out.print("�Է� > ");
			menu = scan.nextInt();
			
			if(menu == 5) {
				break; //�ݺ����� �����ض�!
			}
			
			switch(menu) {
			case 1:
				System.out.println("�Է��ϱ� ó��");
				break;
			case 2:
				System.out.println("�ҷ����� ó��");
				break;
			case 3:
				System.out.println("�����ϱ� ó��");
				break;
			case 4:
				System.out.println("����ϱ� ó��");
				break;
			default:
				System.out.println("�Է¿���!!");
				
			}
			
		}

	}

}
