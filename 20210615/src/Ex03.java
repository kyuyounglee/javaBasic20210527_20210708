import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		// 사용자의 입력을 처리하는 부분
		Scanner s = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int max = s.nextInt();
		int[] scores = new int[max];		
		for (int i = 0; i < scores.length; i++) {
			System.out.println("점수를 입력하세요");
			scores[i] =  s.nextInt();			
		}		
		int hap = 0;
		for (int i = 0; i < scores.length; i++) {
			hap += scores[i];
		}
		
		double avg = hap / (double)max;
		System.out.println(hap);
		System.out.println(avg);
	}

}
