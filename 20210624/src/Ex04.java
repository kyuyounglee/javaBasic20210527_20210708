
public class Ex04 {

	public static void main(String[] args) {
		// double ���迭 ����  5��¥��
		// �迭  VS  ����
		
		double a = 0.0; // ����
		double[] b = new double[5];  // ��ü
		// String�� ��ü���� �Ϲݺ���ó�� ����ϵ��� ���ܸ��״�
		String c = new String("�ȳ��ϼ���");		
		c = "�ݰ�����";
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);		
		// ��ü  new �����ڸ� ���� �Ҵ��� �޴´�
		
//		System.out.printf("b[%d] = %f\n",0,b[0]);
//		System.out.printf("b[%d] = %f\n",1,b[1]);
//		System.out.printf("b[%d] = %f\n",2,b[2]);
//		System.out.printf("b[%d] = %f\n",3,b[3]);
//		System.out.printf("b[%d] = %f\n",4,b[4]);
		
		for (int i = 0; i < b.length; i++) {
			System.out.printf("b[%d] = %f\n",i,b[i]);
		}
		
		
		
		

	}

}
