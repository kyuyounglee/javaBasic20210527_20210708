import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		/*
		 * �ĺ��� ��ǥ�� �ؼ� �ְ� ��ǥ�� ����� ã�°�
		 * �����ڿ� ���� ����� x
		 * choice = sc.nextInt();
		 * vote[choice]++
		 */
		int human = 10;
		Scanner sc = new Scanner(System.in);
		int vote[] = new int[4];
		for (int i = 0; i < human; i++) {
			System.out.println("�ĺ��ڸ� �����ϼ���(0~3): ");
			int choice = sc.nextInt();
			if(choice >=0 && choice <=3 )
				vote[choice]++;
		}
		
		// �ְ� ��ǥ��
		int max = vote[0], candidateNumber = 0;
		for (int i = 0; i < vote.length; i++) {
			if(max < vote[i]) {
				max = vote[i];
				candidateNumber = i;
			}
		}
		// 0 1 2 3
		// 2 3 3 1
		// vote �迭�� ���� �� �ְ�... �׸��� �츮�� max ���߾��
		// �ٽ� �迭�� ��ȯ�ؼ� max �� ���� ���� ������ ��Ұ� � �ִ���
		// 1���� ũ�ٸ� �����ڰ�
		// �����ڰ� �����Ѵٸ� �������
		int sameCount = 0;
		for (int i = 0; i < vote.length; i++) {
			if(max == vote[i])
				sameCount++;
		}
		String[] names = {"�����","������","ȫ�⵿","ö��"};
		
		// �����ڰ� �����Ѵٸ� 1�̻��ϰ�...
		if(sameCount > 1) {
			// �������� index ��ȣ�� ã�Ƽ� ���ο� �迭�� ����
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




