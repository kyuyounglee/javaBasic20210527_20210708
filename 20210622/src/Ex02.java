import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// 정수값의 부호를 판정해서 표시하는 프로그램
		// 1. 값을 입력받는다
		// 2. 판단 양수 또는 음수인지 판단, 제로
		// 3 "다시한번? 1-yes, 0-no"

		// .1 입력
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("정수를 입력하세요");
			int num = sc.nextInt();
			// num 이 양수 인지 음수인지 제로
			System.out.println("양수");
			System.out.println("음수");
			System.out.println("제로");

			System.out.println("계속진행? 1-yes, 0-no");
			num = sc.nextInt();
		}
	}

}
