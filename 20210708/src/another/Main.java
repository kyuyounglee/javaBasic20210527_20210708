package another;

import a01.Test01;
import a01.Test02;

public class Main {

	/**
	 * public 은 어디서나 사용가능
	 * private은 클래스 내부에서만
	 * 생략하면 같은 package에서만
	 * 그리고 package를 생략하면 defaultPackage인데
	 * defaultPackage에 있는 클래스는 다른 패키지에서 사용 불가
	 */
	
	public static void main(String[] args) {
		Test01 a = new Test01();
		Test02 b = new Test02();
		b.publicNumber = 0;
//		a.defaultNumber = 0;

	}

}
