import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// ������ �Է¹޾Ƽ�
		// ���ڸ�����?
		// 45821258
		// 8�ڸ��Դϴ�.
//		int count = 0;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("������ �Է��ϼ���");
//		int num = sc.nextInt();		
		
//		while(num != 0) 
//		{
//			count++;			
//			//num = num / 10;
//			num /=10;
//		}
//		System.out.printf("�ڸ����� %d\n",count);
				
		// �Է��� ����  5    5!
		// 1*2*3*4*5 
		int result = 1;
//		for (int i = 1; i <=num; i++) {
//			result = result * i;			
//		}
//		System.out.printf("%d! = %d\n",num,result);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���");
		int num = sc.nextInt();
		
		System.out.println("�����ڸ� �Է��ϼ���(+,x)");
		String op = sc.next();
		System.out.printf("���� : %d, ������ : %s\n",num,op);
		
		switch (op) {
		case "+":
			result = 0;
			for (int i = 1; i <= num; i++) {
				//result = result+i;
				result += i;
			}
			System.out.println();
			break;
		case "x":			
			result = 1;
			for (int i = 1; i <= num; i++) {
				//result = result8i;
				result *= i;
			}
			System.out.println();
			break;
		default:
			break;
		}
		
		
		
		
	}

}






