import java.util.Arrays;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// 정수형 데이터 5개를 가지는 배열
		int[] a = new int[5];
		
		// 3개의 값을 입력받아서 가장 작은 값을 출력
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			System.out.println("입력");
			a[i] =  sc.nextInt();
		}

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		
		
		
		

	}

}
