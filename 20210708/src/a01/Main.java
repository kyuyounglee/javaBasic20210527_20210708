package a01;

public class Main {

	public static void main(String[] args) {
		// Triangle 객체 생성
		Triangle ti = new Triangle();
		
		ti.setR(3.5);
		ti.setHeight(10);
		ti.setWidth(15);
		ti.show();
//		show(ti);
		
		Triangle abc = new Triangle();
		abc.setR(3.5);
		abc.setHeight(10);
		abc.setWidth(15);
		abc.show();
//		show(abc);
		
		Test01 t01 = new Test01();
		Test02 t02 = new Test02();
		t01.defaultNumber = 0;
		t02.publicNumber = 0;
	}
	
	static public void show(Triangle abc) {
		System.out.println("면적 : " + abc.area() );
		System.out.println("부피 : " + abc.volume());		
		System.out.println("반지름 : " + abc.getR());
		System.out.println("가로의 길이 : " + abc.getWidth());
		System.out.println("세로의 길이 : " + abc.getHeight());
	}

}
