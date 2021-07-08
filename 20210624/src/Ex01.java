import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// 정수를 입력받아서
		// 몇자리인지?
		// 45821258
		// 8자리입니다.
//		int count = 0;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("정수를 입력하세요");
//		int num = sc.nextInt();		
		
//		while(num != 0) 
//		{
//			count++;			
//			//num = num / 10;
//			num /=10;
//		}
//		System.out.printf("자리수는 %d\n",count);
				
		// 입력한 정수  5    5!
		// 1*2*3*4*5 
		int result = 1;
//		for (int i = 1; i <=num; i++) {
//			result = result * i;			
//		}
//		System.out.printf("%d! = %d\n",num,result);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int num = sc.nextInt();
		
		System.out.println("연산자를 입력하세요(+,x)");
		String op = sc.next();
		System.out.printf("숫자 : %d, 연산자 : %s\n",num,op);
		
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






