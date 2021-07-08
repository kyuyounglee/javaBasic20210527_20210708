import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// 사용자로부터 값을 입력받아서
		// 만약 0을 입력하면 순환문을 종료
		// 그렇지 않으며 입력한 숫자의 제곱을 구한다.
		
//		int input = 1;
//		while (input != 0) {
//			Scanner s = new Scanner(System.in);		
//			System.out.println("숫자를 입력하세요(0은 종료)");
//			input = s.nextInt();
//			System.out.printf("입력한 숫자 %d의 제곱은 %d 입니다.\n"
//					,input, input*input);
//		}
		
		
		Scanner s = new Scanner(System.in);		
		while (true) {
			System.out.println("숫자를 입력하세요(0은 종료)");
			int input = s.nextInt();
			if(input == 0) {
				break;
			}				
			System.out.printf("입력한 숫자 %d의 제곱은 %d 입니다.\n"
					,input, input*input);
		}

	}

}
