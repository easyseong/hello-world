class Circle {
	int radius;
	String color;
	
	double calcArea() {
		return 3.14 * radius * radius;
	}
} 

public class ArrayTest {
	public static void main(String[] args) {
		Circle obj;
		obj = new Circle(); 
		obj.radius = 100;
		obj.color = "blue"; 
		double area = obj.calcArea();                                                      
		System.out.println(area);
		
		Circle obj2 = new Circle();
		obj2.radius = 20;
		obj2.color = "red";
		
		
		Circle obj3 = new Circle();
		obj3.radius = 40;
		obj3.color = "white";
		
		
		
		System.out.println(obj.radius);
		System.out.println(obj.color);
		System.out.println(obj2.radius);
		System.out.println(obj2.color );				
	}
}
