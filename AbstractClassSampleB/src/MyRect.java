
public class MyRect extends Shape {
	public int iWidth;
	
	public MyRect() {
		iWidth = 10;
	}
	
	@Override
	public double getSize() {
		return ((double) iWidth * iWidth);
	}

	@Override
	public void draw() {
		System.out.println("면적이 "+(iWidth*iWidth)+ "인 사각형을 그린다");
	}

}
