import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// 시험점수 합계 평균, 최고점, 최저점
		// 시험점수는 입력을 받아
		// 사람수를 입력받아서...(배열의 갯수)
		 
		// 사람수에 해당하는 정수형 배열을 만들것
		Scanner sc = new Scanner(System.in);
		System.out.println("사람수 : ");
		int num = sc.nextInt();
		int[] abc = new int[num];
		// 순환문을 이용해서 시험점수를 입력 받을 것
		int sum = 0;
		for (int i = 0; i < abc.length; i++) {
			sum += abc[i];
		}
		double avg = (double)sum / (double)abc.length;
		int min = abc[0], max=abc[0];
		
		for (int i = 0; i < abc.length; i++) {
			if(max < abc[i])
				max = abc[i];
			
			if(min > abc[i])
				min = abc[i];			
		}
		System.out.printf("총점:%d 평균:%f 최고점:%d 최저점:%d\n",
				 sum,avg,max,min);
		
		
		
		

	}

}
