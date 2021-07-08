import java.util.Random;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// 난수를 생성
		Random r = new Random();
		int num = r.nextInt(100); // 0 ~ 99 사이의 임의의 숫자를 반환
//		System.out.println(num);

		// 숫자 맞추기 게임
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("숫자를 맞춰보세요(0~99)");
			int hnum = sc.nextInt();
			// 사용자가 입력한 값이 컴퓨터값보다 크면 크다
			// 작으면 작다
			if (num == hnum) {
				System.out.println("정답입니다.");
				break;
			} else if (hnum > num)
				System.out.println("크다");
			else
				System.out.println("작다");
		}
	}

}
