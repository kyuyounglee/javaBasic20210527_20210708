import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] vote = new int[4];
		
		for (int i = 0; i < 10; i++) {
			System.out.println("��ǥ�� �ϼ���(0 ~3)");
			int index = sc.nextInt();
			vote[index]++;
		}
		
		// �迭�� ��� ���� ���
		for (int i = 0; i < vote.length; i++) {
			System.out.println(vote[i]);
		}
		
		// �迭�� ����߿� ���� ū ���� ã�ƶ�
		// 1. max ������ �����ϰ� �迭�� ù��° ����� ���� �����Ѵ�.
		int max = vote[0];
		// 2. �迭�� ������ ����� ���� max������ ���ؼ�
		// �迭�� ����� ���� ũ�� max������ ġȯ�Ѵ�
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







