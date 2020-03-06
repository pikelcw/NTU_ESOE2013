
public class Circle extends Shape {
	private double radius;
	
	public Circle(double length) {
		super(length);
		radius=length/2;
	}

	@Override
	public void setLength(double length) {
		this.length=length;
		this.radius=length/2;

	}

	@Override
	public double getArea() {
		return 3.14159*(this.radius)*(this.radius);
	}

	@Override
	public double getPerimeter() {
		return 3.14159*this.length;
	}

}
