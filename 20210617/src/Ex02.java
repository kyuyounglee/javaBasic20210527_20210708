import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		// ���� �Է¹޾Ƽ� �Է��� ���� 3���� ������
		if(input > 0) {
			if(input % 3 == 0)
				System.out.println("3���� �����������ϴ�.");
			else if(input % 3 == 1)
				System.out.println("�������� 1�Դϴ�.");
			else
				System.out.println("�������� 2�Դϴ�.");	
		}else {
			System.out.println("����� �ƴմϴ�.");	
		}
		
		// input % 3      0 1 2
		switch (input % 3) {
		case 0:			
			System.out.println("3���� �����������ϴ�.");
			break;
		case 1:
			System.out.println("�������� 1�Դϴ�.");
			break;
		case 2:
			System.out.println("�������� 2�Դϴ�.");
			break;
		default:
			System.out.println("����� �ƴմϴ�.");
			break;
		}
		
		input = sc.nextInt();
		if(input <0 || input > 100)
			System.out.println();
		//  ����1 &&  ����2    --> �ΰ��� ������ ��θ���  
		//  ����1 ||  ����2    --> ���߿� �ϳ��� ����
		//  50 �̻� 100 �̸�
		//  input >=50  && input <=100
		// �Է��� ������ ���� �� �� �� �� ��  
		// �� 80 �̻�
		// ��  79 ~ 70
		// ��  69 ~ 60
		// ��  59 ~ 50
		// ��  49 ~ 0
		// 0 ~ 100�� �̿��� ���� 
		// �߸��� ���Դϴ�.
		
//		if(input >=0 && input <=100) {
//			if(input >=80)
//				System.out.println("��");
//			else if(input >=70)
//				System.out.println("��");
//			else if(input >=60)
//				System.out.println("��");
//			else if(input >=50)
//				System.out.println("��");
//			else
//				System.out.println("��");
//			
//		}else {
//			System.out.println("�߸��� ��");
//		}
		
		if(input < 0 || input >100)
			System.out.println("�߸��� ��");		
		else if(input >=80)
			System.out.println("��");
		else if(input >= 70)
			System.out.println("��");
		else if(input >= 60)
			System.out.println("��");
		else if(input >= 50)
			System.out.println("��");
		else
			System.out.println("��");
		
		// �ΰ��� ���� �޾Ƽ� �� ���̸� ǥ��
		// 10 5    5
		// 5  10   5
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int diff = a- b;
		System.out.printf("%d �� %d�� ���̴� %d �Դϴ�.\n", a, b, diff );
		
		
	}

}
