
public class MyRect extends Shape {
	
	public MyRect () {
		strName ="";
	}
	public MyRect(String name) {
		strName = name;
	}
	public void drow() {
		super.drow();
		System.out.println(strName +"À» ±×·È´Ù");
	}
	public void paint() {
		System.out.println(strName +"À» »öÄ¥Çß´Ù.");
	}
}
