import java.util.Random;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// ������ ����
		Random r = new Random();
		int num = r.nextInt(100); // 0 ~ 99 ������ ������ ���ڸ� ��ȯ
//		System.out.println(num);

		// ���� ���߱� ����
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("���ڸ� ���纸����(0~99)");
			int hnum = sc.nextInt();
			// ����ڰ� �Է��� ���� ��ǻ�Ͱ����� ũ�� ũ��
			// ������ �۴�
			if (num == hnum) {
				System.out.println("�����Դϴ�.");
				break;
			} else if (hnum > num)
				System.out.println("ũ��");
			else
				System.out.println("�۴�");
		}
	}

}
