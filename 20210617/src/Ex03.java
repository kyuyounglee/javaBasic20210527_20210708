import java.util.Arrays;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// ������ ������ 5���� ������ �迭
		int[] a = new int[5];
		
		// 3���� ���� �Է¹޾Ƽ� ���� ���� ���� ���
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			System.out.println("�Է�");
			a[i] =  sc.nextInt();
		}

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		
		
		
		

	}

}
