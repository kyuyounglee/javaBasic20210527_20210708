import java.util.Arrays;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// ������ �迭�� ������ �Է¹޾Ƽ� �ش� ������ŭ �迭�� �����
		// input = 3
		//  int[] abc = new int[input]
		// ���� �Է��� �޾Ƽ�  1 5 7
		// ���
		// {1, 5, 7}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�迭�� ������ �Է�");
		int input = sc.nextInt();
		
		int[] abc = new int[ input];
		
		// �迭������ŭ �Է��� �޾Ƽ�... �迭�� �� ��Ҹ� ä���
		for (int i = 0; i < abc.length; i++) {
			System.out.println("���� �Է��ϼ���[" + (abc.length-i) + "]");
			abc[i] = sc.nextInt();			
		}
		// {1, 5, 7, }
		System.out.print("{");
		for (int i = 0; i < abc.length; i++) {			
			if(i != abc.length-1)
				System.out.print(abc[i] + ", ");				
			else
				System.out.print(abc[i]);
		}
		System.out.print("}");
		// {1, 5, 7, }  x
		//{1, 5, 7}  o
	}
	
	

}
