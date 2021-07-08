import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// 2개의 정수를 입력해서
		// 작은수 부터 차례로 출력
		// 예) 15 20
		// 15 16 17 18 19 20
		// 25 20
		// 20 21 22 23 24 25
		Scanner sc = new Scanner(System.in);
		System.out.println("두 수를 입력하세요");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		// 1.
//		if (num1 > num2) {
//			int temp = num1;
//			num1 = num2;
//			num2 = temp;
//		}
		int min=0,max=0;
		if(num1>num2) {
			max = num1;
			min = num2;
		}else {
			max = num2;
			min = num1;
		}			
		
		for (int i = min; i <= max; i++) {
			System.out.println(i);
		}

	}

}
