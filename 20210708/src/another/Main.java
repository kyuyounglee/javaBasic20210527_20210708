package another;

import a01.Test01;
import a01.Test02;

public class Main {

	/**
	 * public �� ��𼭳� ��밡��
	 * private�� Ŭ���� ���ο�����
	 * �����ϸ� ���� package������
	 * �׸��� package�� �����ϸ� defaultPackage�ε�
	 * defaultPackage�� �ִ� Ŭ������ �ٸ� ��Ű������ ��� �Ұ�
	 */
	
	public static void main(String[] args) {
		Test01 a = new Test01();
		Test02 b = new Test02();
		b.publicNumber = 0;
//		a.defaultNumber = 0;

	}

}
