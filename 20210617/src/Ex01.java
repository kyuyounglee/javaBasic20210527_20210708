import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// Ű����� �Է��� ���� ���� ���̸� ���� ���̸� ��� ��� ���
		Scanner sc = new Scanner(System.in);
		System.out.println("�Է�");
		int input =  sc.nextInt();
		
		if(input > 0) {
			System.out.println("���");
		}else if(input < 0){
			System.out.println("����");			
		}else {
			System.out.println("0");
		}
		
		// �������� �Է� �޾Ƽ� ���� ���� ���
		// 1   1   -1   1
		System.out.println("�Է�");
		input =  sc.nextInt();		
		input = (input > 0)? input : -input;
		System.out.println(input);
		
		//  �μ��� �Է¹޾Ƽ�   a b
		// b�� a�� ����̴�.  ����� �ƴϴ�.
		//  12 4  --> 4�� 12�� ����̴�.
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		// a : 12   b : 4
		// 12 / 4  
		if(a % b != 0)  // ���� �����ϱ⿡ ���� �߻� �󵵼��� ���� ���
			System.out.printf("%d�� %d�� ����� �ƴϴ�\n",b,a);
		else
			System.out.printf("%d�� %d�� ����̴�\n",b,a);
		
		// �����������϶�		
		// �Է��� ���� ���� 5�� ������ �������� 
		// 5�� ������ ��������.
		// 5�� ������ �������� �ʴ´�.
		
		// ���� �������� �Է��߽��ϴ�.
		
		
		

	}

}
