package hacker_rank;

// Polygon (interface)
interface Polygon {
	int getNumberOfSides();

	double getPerimeter();
}

// Triangle
class Triangle implements Polygon {
	private static int numberOfSides = 3;
	private double side1;
	private double side2;
	private double side3;

	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public int getNumberOfSides() {
		return numberOfSides;
	}

	public double getPerimeter() {
		return side1 + side2 + side3;
	}
}

// Rectangle
class Rectangle implements Polygon {
	private static int numberOfSides = 4;
	private double side1;
	private double side2;

	public Rectangle(double side1, double side2) {
		this.side1 = side1;
		this.side2 = side2;
	}

	public int getNumberOfSides() {
		return numberOfSides;
	}

	public double getPerimeter() {
		return side1 + side1 + side2 + side2;
	}
}

// Square
class Square extends Rectangle implements Polygon {
	public Square(double side) {
		super(side, side);
	}
}

// Main
public class PolygonSolution {

	public static void print(Polygon p) {
		System.out.println("A " + p.getClass().getSimpleName() + " has " + p.getNumberOfSides() + " sides.");
		System.out.println("The perimeter of this shape is " + p.getPerimeter() + "\n");
	}

	public static void main(String[] args) {
		Polygon triangle = new Triangle(1, 2, 3);
		print(triangle);

		Polygon rectangle = new Rectangle(2, 1);
		print(rectangle);

		Polygon square = new Square(3);
		print(square);
	}

}
