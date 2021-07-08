import java.util.Arrays;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// 정수형 배열의 갯수를 입력받아서 해당 개수만큼 배열을 만들고
		// input = 3
		//  int[] abc = new int[input]
		// 각각 입력을 받아서  1 5 7
		// 출력
		// {1, 5, 7}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("배열의 갯수를 입력");
		int input = sc.nextInt();
		
		int[] abc = new int[ input];
		
		// 배열갯수만큼 입력을 받아서... 배열의 각 요소를 채운다
		for (int i = 0; i < abc.length; i++) {
			System.out.println("값을 입력하세요[" + (abc.length-i) + "]");
			abc[i] = sc.nextInt();			
		}
		// {1, 5, 7, }
		System.out.print("{");
		for (int i = 0; i < abc.length; i++) {			
			if(i != abc.length-1)
				System.out.print(abc[i] + ", ");				
			else
				System.out.print(abc[i]);
		}
		System.out.print("}");
		// {1, 5, 7, }  x
		//{1, 5, 7}  o
	}
	
	

}
