

public class Mycircle extends Shape {
	public Mycircle () {
		strName ="";
	}
	public Mycircle(String name) {
		strName = name;
	}
	public void drow() {
		// TODO Auto-generated method stub
		super.drow();
		System.out.println(strName +"À» ±×·È´Ù");
	}

}
