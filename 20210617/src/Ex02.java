import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		// 값을 입력받아서 입력한 값을 3으로 나눠서
		if(input > 0) {
			if(input % 3 == 0)
				System.out.println("3으로 나눠떨어집니다.");
			else if(input % 3 == 1)
				System.out.println("나머지가 1입니다.");
			else
				System.out.println("나머지가 2입니다.");	
		}else {
			System.out.println("양수가 아닙니다.");	
		}
		
		// input % 3      0 1 2
		switch (input % 3) {
		case 0:			
			System.out.println("3으로 나눠떨어집니다.");
			break;
		case 1:
			System.out.println("나머지가 1입니다.");
			break;
		case 2:
			System.out.println("나머지가 2입니다.");
			break;
		default:
			System.out.println("양수가 아닙니다.");
			break;
		}
		
		input = sc.nextInt();
		if(input <0 || input > 100)
			System.out.println();
		//  조건1 &&  조건2    --> 두개의 조건으 모두만족  
		//  조건1 ||  조건2    --> 둘중에 하나만 만족
		//  50 이상 100 미만
		//  input >=50  && input <=100
		// 입력한 점수에 따라서 수 우 미 양 가  
		// 수 80 이상
		// 우  79 ~ 70
		// 미  69 ~ 60
		// 양  59 ~ 50
		// 가  49 ~ 0
		// 0 ~ 100점 이외의 값은 
		// 잘못된 값입니다.
		
//		if(input >=0 && input <=100) {
//			if(input >=80)
//				System.out.println("수");
//			else if(input >=70)
//				System.out.println("우");
//			else if(input >=60)
//				System.out.println("미");
//			else if(input >=50)
//				System.out.println("양");
//			else
//				System.out.println("가");
//			
//		}else {
//			System.out.println("잘못된 값");
//		}
		
		if(input < 0 || input >100)
			System.out.println("잘못된 값");		
		else if(input >=80)
			System.out.println("수");
		else if(input >= 70)
			System.out.println("우");
		else if(input >= 60)
			System.out.println("미");
		else if(input >= 50)
			System.out.println("양");
		else
			System.out.println("가");
		
		// 두개의 값을 받아서 그 차이를 표시
		// 10 5    5
		// 5  10   5
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int diff = a- b;
		System.out.printf("%d 와 %d의 차이는 %d 입니다.\n", a, b, diff );
		
		
	}

}
