package pattern.factory;

public class ShapeAPITest {
	public static void main(String[] args) {
		ShapeFactory factory = new ShapeFactory();
		Shape shape = factory.getShape("circle");
		shape.draw();
		
		shape = factory.getShape("square");
		shape.draw();
		
		shape = factory.getShape("rectangle");
		shape.draw();
	}
}
