import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// �������� ��ȣ�� �����ؼ� ǥ���ϴ� ���α׷�
		// 1. ���� �Է¹޴´�
		// 2. �Ǵ� ��� �Ǵ� �������� �Ǵ�, ����
		// 3 "�ٽ��ѹ�? 1-yes, 0-no"

		// .1 �Է�
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("������ �Է��ϼ���");
			int num = sc.nextInt();
			// num �� ��� ���� �������� ����
			System.out.println("���");
			System.out.println("����");
			System.out.println("����");

			System.out.println("�������? 1-yes, 0-no");
			num = sc.nextInt();
		}
	}

}
