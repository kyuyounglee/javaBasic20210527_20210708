
public class Ex01 {

	public static void main(String[] args) {
		// ��ȯ�� 
		// 1.for --> Ƚ�� , �迭
		// 2. while --> Ư�������� ����  if  break
		//1  ���� 10���� ���ض�...
		// 1+2+ 3+ 4+5+6+7+8+9+10
		int result = 0;
		for (int i = 1; i <= 10; i++) {
			result += i;			
		}
		
		result = 0;
		// result �� ���� 2�� ������Ű�鼭 100���� ����������
		// 1.
		while (true) {
			if(result>=100)
				break;
			result += 2;
		}
		result = 0;
		// 2
		while (result < 100) {
			result += 2;
		}
		
		
		

	}

}
