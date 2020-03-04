package heewon;

public class Hello {
//접근제한이 없는 클래스 이름은 Hello
	public static void main(String[] args) {
		// 한줄 주석
		/*
		 * 이건 여러줄 주석
		 * 하하하
		 * 호호호
		 * 히히히
		 */
		
		/*
		 * 데이터의 종류
		 * 
		 * 1.숫자
		 * 	1)정수 - 소수점이 없는 숫자
		 * 		(integer)
		 * 	2)실수 - 소수점이 있는 숫자(부동소수점)
		 * 		(float)
		 * 2.문자(character)
		 * 3.문자열(string)
		 * 4.진리값(true/false)
		 */
		
		
		/*
		 * 메모리에서 모든 프로그램은 동작함.
		 * 데이터도 모두 메모리에 저장되어야 함.
		 * 데이터를 저장하는 공간을 변수라고 함.
		 */
		
		
		/*
		 * 자료형의 종류
		 * 1. 진리값 자료형 boolean
		 * 1-1. 바이트 자료형 byte - 1byte
		 * 2. 문자형 자료형 char - 2byte
		 * 3. 정수형 자료형 
		 * 		short - 2byte
		 * 		int - 4byte
		 * 		long - 4byte
		 * 4. 실수형 자료형
		 * 		float - 4byte
		 * 		double - 8byte
		 * 5. 참조 자료형
		 * 		문자열 - String
		 *
		 */
		
		/*
		 * 프로그램을 작성할 때 생각해야 할 일
		 * 1. 어떠한 데이터가 입력/출력되는가.
		 * 	-> 데이터를 처리할 공간이 필요하다.
		 *  -> 해당 데이터의 변수를 만들어야 한다.
		 */
		
		/*
		 * 변수를 만드는 방법
		 * 자료형 이름 ; ex) int a;
		 * 진리값 저장 변수 
		 */
		boolean b = false; //각 변수들은 초기값을 설정해줘야한다. (대입 연산자)
		byte bb = 0;
		char ch = '\0';
		short s = 0;
		int i = 0;
		long l = 0L;
		float f = 0.0f;
		double d = 0.0f;
		
		String str1 = "";
		String str2 = null;
		
		System.out.println("안녕?\n"); // \n : 여러번쓰면 여러번 가능, ln : 한번만가능
		System.out.println("난 노희원이라고해");
		System.out.println("나이는 29살이구");
		System.out.println("별명은 노가리야");
		System.out.println("소프트웨어학과 졸업했어");
		System.out.println("취미는 농구,게임,영화보기야");
		System.out.println("주량은 소주 반병이야");
		System.out.println("앞으로 잘 지내보자!!");
		System.out.printf("%f + %d = %f", 1.5, 2, 1.5+2); //d : 10진수
		
		
		
	}

}
