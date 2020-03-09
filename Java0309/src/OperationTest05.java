
public class OperationTest05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//반복문
		//while문
		//while(조건식){...}
		//1~100까지 숫자의 총합
		int i = 1;
		
		int sum = 0;
		
		while(i < 9) {
			i++;
			int j = 1;
			while(j < 10) {
				System.out.printf("%d*%d=%2d ", j,i,i*j);
				j++;
				
			}
			
			System.out.println();
				
		}
		
		/*System.out.println("1~100까지 총합은" + sum);
		
		int sum2 = 0;
		for(int j = 1; j <= 100; j++) {
			sum2 += j;
		}
		System.out.println("1~100까지 총합은" + sum2);*/
	}

}
