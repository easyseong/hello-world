class Circle {
	int radius;
	String color;
	
	double calcArea() {
		return 3.14 * radius * radius;
	}//�޼ҵ� : Ŭ���� �ȿ� ���ǵ� �Լ�
} //Ŭ���� ����

public class ArrayTest {
	public static void main(String[] args) {
		Circle obj; //�������� ����(��ü�� �ּ� ����)
		obj = new Circle(); //��ü ����
		obj.radius = 100;
		obj.color = "blue"; //��ü�� �ʵ� ����
		double area = obj.calcArea(); //��ü �޼ҵ� ����                                                               
		System.out.println("���� ����= "+ area);
		
		Circle obj2 = new Circle();
		obj2.radius = 20;
		obj2.color = "red";
		obj2 = obj;
		
		
		System.out.println(obj.radius);
		System.out.println(obj.color);
		System.out.println(obj2.radius);
		System.out.println(obj2.color );
		
		
		
	}

}
