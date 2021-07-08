import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// 키보드로 입력한 정수 값이 음이면 음수 양이면 양수 라고 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("입력");
		int input =  sc.nextInt();
		
		if(input > 0) {
			System.out.println("양수");
		}else if(input < 0){
			System.out.println("음수");			
		}else {
			System.out.println("0");
		}
		
		// 정수값을 입력 받아서 절대 값을 출력
		// 1   1   -1   1
		System.out.println("입력");
		input =  sc.nextInt();		
		input = (input > 0)? input : -input;
		System.out.println(input);
		
		//  두수를 입력받아서   a b
		// b는 a의 약수이다.  약수가 아니다.
		//  12 4  --> 4는 12의 약수이다.
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		// a : 12   b : 4
		// 12 / 4  
		if(a % b != 0)  // 내가 예상하기에 가장 발생 빈도수가 많은 경우
			System.out.printf("%d는 %d의 약수가 아니다\n",b,a);
		else
			System.out.printf("%d는 %d의 약수이다\n",b,a);
		
		// 양의정수값일때		
		// 입력한 정수 값이 5로 나누어 떨어지면 
		// 5로 나누어 떨어진다.
		// 5로 나누어 떨어지지 않는다.
		
		// 음의 정수값을 입력했습니다.
		
		
		

	}

}
