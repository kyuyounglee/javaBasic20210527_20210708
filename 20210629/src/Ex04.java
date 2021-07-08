import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] vote = new int[4];
		
		for (int i = 0; i < 10; i++) {
			System.out.println("투표를 하세요(0 ~3)");
			int index = sc.nextInt();
			vote[index]++;
		}
		
		// 배열의 모든 값을 출력
		for (int i = 0; i < vote.length; i++) {
			System.out.println(vote[i]);
		}
		
		// 배열의 요소중에 가장 큰 값을 찾아라
		// 1. max 변수를 선언하고 배열을 첫번째 요소의 값을 대입한다.
		int max = vote[0];
		// 2. 배열의 각각의 요소의 값을 max변수와 비교해서
		// 배열의 요소의 값이 크면 max변수를 치환한다
		int maxIndex = 0;
		for (int i = 0; i < vote.length; i++) {
			if(max < vote[i]) {
				max = vote[i];
				maxIndex = i;
			}
		}
		System.out.println("max = " + max);
		System.out.println("maxIndex = " + maxIndex);
		
		maxIndex = 0;
		for (int i = 0; i < vote.length; i++) {
			if(max == vote[i])
				maxIndex = i;
		}
		System.out.println("maxIndex = " + maxIndex);

	}

}







