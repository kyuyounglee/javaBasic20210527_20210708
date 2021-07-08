import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		//양의 정수를 입력하면... D-day
		// 5
		// 5 4 3 2 1
		// 2
		// 2 1
		// -8
		Scanner sc = new Scanner(System.in);
		int num = -1;
		while(num < 0) 
		{
			System.out.println("양의 정수를 입력하세요");
			num = sc.nextInt();
//			if(num > 0)
//				break;
		}
		
		for (int i = num; i > 0; i--) {
			System.out.println(i);
		}

	}

}
