import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// 2���� ������ �Է��ؼ�
		// ������ ���� ���ʷ� ���
		// ��) 15 20
		// 15 16 17 18 19 20
		// 25 20
		// 20 21 22 23 24 25
		Scanner sc = new Scanner(System.in);
		System.out.println("�� ���� �Է��ϼ���");
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
