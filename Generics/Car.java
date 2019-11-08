package lect25Generics;

public class Car implements Comparable<Car> {
	int speed;
	int price;
	String color;

	public Car(int speed, int price, String color) {
		this.speed = speed;
		this.price = price;
		this.color = color;
	}


	@Override
	public String toString() {
	return "S:" + " " + speed + " " + "P:" + price + " C:" + color;
	}

	@Override
	public int compareTo(Car other) {
		return this.speed - other.speed;
		//return other.price - this.price;// highest price lowest priority
		// return this.color.compareTo(other.color);
	}
}
