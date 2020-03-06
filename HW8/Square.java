
public class Square extends Shape {

	public Square(double length) {
		super(length);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setLength(double length) {
		this.length=length;

	}

	@Override
	public double getArea() {
		return this.length*this.length;
	}

	@Override
	public double getPerimeter() {
		return this.length*4;
	}

}
