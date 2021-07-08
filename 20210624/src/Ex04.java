
public class Ex04 {

	public static void main(String[] args) {
		// double 형배열 선언  5개짜리
		// 배열  VS  변수
		
		double a = 0.0; // 변수
		double[] b = new double[5];  // 객체
		// String은 객체지만 일반변수처럼 사용하도록 예외를뒀다
		String c = new String("안녕하세요");		
		c = "반가워요";
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);		
		// 객체  new 연산자를 통해 할당을 받는다
		
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
