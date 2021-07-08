import java.util.Iterator;
import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("두 수를 입력하세요");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		// 15 20 15 16 17 18 19 20
		// 20 15 20 19 18 17 16 15
		if (num1 < num2) {
			for (int i = num1; i <= num2; i++) {
				System.out.println(i);
			}
		} else {
			for (int i = num1; i >= num2; i--) {
				System.out.println(i);
			}
		}

	}

}
