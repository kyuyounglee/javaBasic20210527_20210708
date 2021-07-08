import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// 키를 입력받으세요.... double
		/*
		 * 150.3
		 * 170.2
		 * 5
		 * 150.3
		 * 155.3
		 * 160.3
		 * 165.3
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 cm 부터");
		double start =  sc.nextDouble();
		double end = 0.0;
		//while(start > end )
		while(true)
		{
			System.out.println("몇 cm 까지");
			end =  sc.nextDouble();
			if(end > start)
				break;
		}
		
		System.out.println("단위");
		double step = sc.nextDouble();
		
		for (double i = start; i <= end; i = i+2) {
			System.out.println(i);
		}

	}

}
