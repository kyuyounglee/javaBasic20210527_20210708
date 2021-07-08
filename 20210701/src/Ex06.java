import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		/*
		 * 후보자 투표를 해서 최고 득표한 사람을 찾는거
		 * 동점자에 대한 고려는 x
		 * choice = sc.nextInt();
		 * vote[choice]++
		 */
		int human = 10;
		Scanner sc = new Scanner(System.in);
		int vote[] = new int[4];
		for (int i = 0; i < human; i++) {
			System.out.println("후보자를 선택하세요(0~3): ");
			int choice = sc.nextInt();
			if(choice >=0 && choice <=3 )
				vote[choice]++;
		}
		
		// 최고 득표자
		int max = vote[0], candidateNumber = 0;
		for (int i = 0; i < vote.length; i++) {
			if(max < vote[i]) {
				max = vote[i];
				candidateNumber = i;
			}
		}
		// 0 1 2 3
		// 2 3 3 1
		// vote 배열에 값이 다 있고... 그리고 우리는 max 구했어요
		// 다시 배열을 순환해서 max 와 같은 값을 가지는 요소가 몇개 있는지
		// 1보다 크다면 동점자가
		// 동점자가 존재한다면 몇명인지
		int sameCount = 0;
		for (int i = 0; i < vote.length; i++) {
			if(max == vote[i])
				sameCount++;
		}
		String[] names = {"이재명","윤석열","홍기동","철이"};
		
		// 동점자가 존재한다면 1이상일것...
		if(sameCount > 1) {
			// 동점자의 index 번호를 찾아서 새로우 배열에 넣자
			int[] sameArray = new int[sameCount];
			int index = 0;
			for (int i = 0; i < vote.length; i++) {
				if(max == vote[i]) {
					sameArray[index] = i;
					index++;
				}
			}
			for (int i = 0; i < sameArray.length; i++) {
				System.out.println( names[sameArray[i]] );
			}
		}else 
		{
			System.out.println( names[sameCount] );
		}
		
		
		
		
		
	}

}




