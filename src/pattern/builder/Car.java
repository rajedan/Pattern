package pattern.builder;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
/**
 * Represents a car with specified wheel and color
 * @author rajedan@gmail.com
 */
public class Car {
	/**
	 * Number of Wheels of the Car
	 */
	private int wheels;
	/**
	 * Color of the Car
	 */
	private String color;
}
