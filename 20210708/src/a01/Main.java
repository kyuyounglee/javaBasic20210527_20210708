package a01;

public class Main {

	public static void main(String[] args) {
		// Triangle ��ü ����
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
		System.out.println("���� : " + abc.area() );
		System.out.println("���� : " + abc.volume());		
		System.out.println("������ : " + abc.getR());
		System.out.println("������ ���� : " + abc.getWidth());
		System.out.println("������ ���� : " + abc.getHeight());
	}

}
