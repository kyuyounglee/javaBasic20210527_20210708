import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// 5�� ������ ���
		Scanner sc = new Scanner(System.in);
		System.out.println("��� *�� ǥ���ұ��");
		int num = sc.nextInt();
		
		if(num / 5 != 0) {
			int length = num / 5;
			for (int t = 0; t < length; t++) {
				for (int i = 0; i < 5; i++) {
					System.out.print("*");			// *****
				}	
				System.out.println();
			}
			
		}
		
		if(num % 5 != 0) {
			for (int i = 0; i < num % 5; i++) {
				System.out.print("*");				
			}
		}
		
		
		
		// num / 5
		// num % 5
		
		// 16
		/*
		 * 			*****
		 * 			*****
		 * 			*****
		 * 			*
		 */
		

	}

}
