
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
		System.out.println("������ "+(iWidth*iWidth)+ "�� �簢���� �׸���");
	}

}
