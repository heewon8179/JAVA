/*
		 * 1. ������Ģ
		 * �������
		  1. Ŭ���� �̸��� ù ���ڴ� �׻� �빮�ڷ� �Ѵ�. -������ �޼��� �̸��� ù ���ڴ� �׻� �ҹ��ڷ� �Ѵ�
		  2. ���� �ܾ� �̸��� �ܾ��� ù ���ڸ� �빮�ڷ� �Ѵ�. -ex) lastIndexOf, StringBuffer
		  3. ����� �̸��� �빮�ڷ� �Ѵ�. �ܾ�� '_'�� �����Ѵ� - PI 
		  
		  2. 
		  ���� - �ϳ��� ���� �����ϱ� ���� ����
		  ��� - �ѹ��� ���� ������ �� �ִ� ����
		  ������ ���� ��� �ٲ� �� �� ������ ����� �ѹ� ���� ���ԵǸ� ���Ŀ� ������ �Ұ��ϴ�
		  ���ͷ� - �� ��ü�� ���� �ǹ��ϴ� ��
		  ex) int score = 100;
		   		score = 200;
		   		char ch = 'A';
		   		String str = "abc";
		   		final int MAX = 100; //��� ������ �� �տ� final�� �ٿ��ְ� ������ ��� �����ϱ� ���� �빮�ڷ� �ۼ�
		   		= �����ʿ� �ִ� �� ��ü�� ���ͷ��̶���.
		  
		  
		 */
public class VariableTest {
	
	public static void main(String[] args) {
		//����
		int num = 100;		 
		num = 200;			//���� ����/���� ���� �ÿ� ������ ����� �ߴ� ���� : ������ ������� �ʾƼ� (���� �ȿ� �ִ� ���� ������ ���� ������ ����Ѵٴ� �ǹ�) 
		char ch = 'A';		//char ch = ''; - ��ĭ���� �ʱ�ȭ �Ұ� -> char ch = '\0'; ���� ��ĭ �ʱ�ȭ ����		//char ch = ' ';  - �����̽��� �����̹Ƿ� ���鹮�ڷ� �ʱ�ȭ ���� 
		char ch2 = '��';
		//char ch3 = 'abc';  //char�� �������̹Ƿ� �������� ���� �Ұ�
		String str = ""; //������ ���� �� ��ĭ���� �ʱ�ȭ
		String str2 = null;
		
		//���
		final float PI;
		PI = 4.0f;
		//PI = 3.14f;
		
		int a = 10;
		float f = a; 
		
		System.out.println(f);
		
		float realNumber = 3.14f;		//�����̶� �ܿ�����) float ������ ���� ���� �Է��� ���� �׻� ���̻縦 �ٿ����� - ���̻� ������ Hello.java (4. �ڷ���(������Ÿ��)�� ����) ���� 
		System.out.println(realNumber);
		
		//System.out.printf("%f", realNumber);
		
		//��ȣ + , - (���� - https://m.blog.naver.com/PostView.nhn?blogId=ansdbtls4067&logNo=220886567257&proxyReferer=https%3A%2F%2Fwww.google.com%2F)
		
		//(�ڷ�)����ȯ - ĳ��Ʈ������
		//�ڵ�����ȯ - (�Ͻ���/������)����ȯ
		//��������ȯ - ����������ȯ
		int n1 = 5;
		int n2 = 2;
		
		System.out.println(n1/n2);		//�������̹Ƿ� �������� �� ��� �Ҽ��� ������ ���� �ҽǵ�.
		
	/*	float f1 = 3.145f;		//�ڷ����� ū�ſ��� ���� �ɷ� ��ȯ�� ��� ���� �߻�
		int nf =f1;
		*/
		
		float f1 = 3.145f;
		int nf = (int)f1;		//�ڷ����� ���Ƿ� �ٲ��ָ� ���� �ذ�
		
		System.out.println((float)n1/n2);		//����ȯ ���� : n1�� float���� ����ȯ -> n2�� �ڵ����� float���� ����ȯ -> ��갪�� ��µ�
		//�ٸ� �ڷ��� ���� ����
		//n1 = 5.0f; // ������ Ÿ���� ��ȯ������ �ʴ´�.
		
		//���� < �Ǽ� < ���ڿ�
		//������ ���ڿ� ��ȯ 
	/*	String str3 = "";
		int ntoa = 10;
		str3 = (String)ntoa;		//�̷��� ���ڿ��� ���������δ� ��ȯ �Ұ�
		*/
		
		String str3 = "abc";
		int ntoa = 10;
		str3 = ntoa + "";		//String ���� ����ȯ �ϴ� ���!! - ���� + "" �̷��� ��� ��� string���� ��ȯ�ǰ� string ������ �����
		System.out.println(str3);
		
		/*����
		 ���� �� ĳ��Ʈ�������� ������ ������ ������?
		 int num1 = 10;
		 1. byte�� ��ȯ : byte b = (byte)num1;
		 2. double�� ��ȯ : double d = num1;
		 3. short�� ��ȯ : short s = (short)num1;
		 4. long�� ��ȯ : long l = num1;
		 ����)2.4�� - ���������� ũ�Ⱑ �� ũ�⶧���� ���� ������ �ʿ� ����
		 */
	
		//�����÷ο�/����÷ο�
		 byte b = 127;
		 b++;			//�����÷ο찡 �� - �ڹٿ����� �⺻  'signed char ������ ��'
		 System.out.println(b);	
		 
	}
}