import java.util.Scanner;

public class ControlTest02 {

	public static void main(String[] args) {
		
		// ���ǹ� switch
		// ���� �б⸦ ���� �¾ ���.
		// case, default
		// ��Ÿ ����� break.
		Scanner scan = new Scanner(System.in);
		
		//011 - sk, 016 - kt, 019 - LG
		
		System.out.print("��ȣ �Է� : ");
		int num = scan.nextInt();
		
		switch(num) {
		case 11 : 
			System.out.println("SK�Դϴ�.");
			break;
		case 16:
			System.out.println("KT�Դϴ�.");
			break;
		case 19:
			System.out.println("LG�Դϴ�.");
			break; //�� case�� �����ϰ��ϴ� ����
		default:
			System.out.println("��Ÿ ");
		}
	}

}
