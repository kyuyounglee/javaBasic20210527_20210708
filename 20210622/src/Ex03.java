import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// 사용자가 입력하 값이  12  125   12548  
		// 3자리 정수일때까지 입력을 받아라..
		// 100 ~ 999 사이의 값이 입력이 되면 순환문 종료
		
		Scanner sc = new Scanner(System.in);
		System.out.println("세자리 정수 입력");
		int num = sc.nextInt();		
		System.out.println("세자리 정수 : "+ num);
		
		

	}

}
