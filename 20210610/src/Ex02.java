import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// ����ڷκ��� ���� �Է¹޾Ƽ�
		// ���� 0�� �Է��ϸ� ��ȯ���� ����
		// �׷��� ������ �Է��� ������ ������ ���Ѵ�.
		
//		int input = 1;
//		while (input != 0) {
//			Scanner s = new Scanner(System.in);		
//			System.out.println("���ڸ� �Է��ϼ���(0�� ����)");
//			input = s.nextInt();
//			System.out.printf("�Է��� ���� %d�� ������ %d �Դϴ�.\n"
//					,input, input*input);
//		}
		
		
		Scanner s = new Scanner(System.in);		
		while (true) {
			System.out.println("���ڸ� �Է��ϼ���(0�� ����)");
			int input = s.nextInt();
			if(input == 0) {
				break;
			}				
			System.out.printf("�Է��� ���� %d�� ������ %d �Դϴ�.\n"
					,input, input*input);
		}

	}

}
