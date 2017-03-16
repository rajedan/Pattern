
public class TestAPI {
	public static void main(String[] args) {
		Car car = Car.builder().wheels(4).color("Black").build();
		System.out.println(car.getWheels());
		System.out.println(car.getColor());
		Car.CarBuilder builder = new Car.CarBuilder();
		System.out.println(builder.build());
		System.out.println(Car.builder());
	}
}
