import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		int a  = 2;
		int b = 1;
		int c = 0;
		if(a % 2 == 0) c= c+1; 
		if(b % 2 == 0) c= c+1;
		if(c == 0)
			System.out.println("�Ѵ� Ȧ��");
		else if(c == 1)
			System.out.println("���߿� �ϳ��� Ȧ��");
		else if(c == 2)
			System.out.println("�Ѵ� ¦��");
		// ���ڸ� �Է��ϼ���
		// 3
		// *+*
		// 5
		//*+*+*
		// 7
		//*+*+*+*
		// 4
		//*+*+
		
		Scanner sc = new Scanner(System.in);
		System.out.println("input");
		int num =  sc.nextInt();		
		for (int i = 0; i < num; i++) {
			if(i % 2 == 0)
				System.out.print("*");
			else
				System.out.print("+");
		}

	}

}
