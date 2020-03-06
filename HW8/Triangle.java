
public class Triangle extends Shape {

	public Triangle(double length) {
		super(length);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setLength(double length) {
		this.length=length;
	}

	@Override
	public double getArea() {
		return (this.length*this.length/2*1.73205/2);
	}

	@Override
	public double getPerimeter() {
		return this.length*3;
	}

}
