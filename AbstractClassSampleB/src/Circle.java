
public class Circle extends Shape {
	protected int radius;
	public Circle () {
		radius = 10;
	}
	@Override
	public double getSize() {
		
		return radius * radius * 3.14;
	}

	@Override
	public void draw() {
		System.out.println("Circle ±¸Çö :"+(radius*radius*3.14));
		
	}

}
