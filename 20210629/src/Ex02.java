
public class Ex02 {

	public static void main(String[] args) {
		int[][] score = new int[3][5];
		score[1][2] = 100;

		// 배열 초기화
		int[] abc = { 10, 20, 30, 40, 50 };
		for (int i = 0; i < abc.length; i++) {
			System.out.println(abc[i]);
		}
		
		int[][] aaa = { 
				{ 10, 20, 30, 40, 50 }, // aaa[0].length  5
				{ 10, 20, 30, 40, 50 }, // aaa[1].length  5
				{ 10, 20, 30, 40, 50 }  // aaa[2].length  5
				};
		
		for (int i = 0; i < aaa.length; i++) {
			for (int j = 0; j < aaa[0].length; j++) {
				System.out.print(aaa[i][j]+" ");
			}	
			System.out.println();
		}
		
		

	}

}
