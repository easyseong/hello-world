class Circle {
	int radius;
	String color;
	
	double calcArea() {
		return 3.14 * radius * radius;
	}//메소드 : 클래스 안에 정의된 함수
} //클래스 정의

public class ArrayTest {
	public static void main(String[] args) {
		Circle obj; //참조변수 선언(객체의 주소 저장)
		obj = new Circle(); //객체 생성
		obj.radius = 100;
		obj.color = "blue"; //객체의 필드 접근
		double area = obj.calcArea(); //객체 메소드 접근                                                               
		System.out.println("원의 면적= "+ area);
		
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
