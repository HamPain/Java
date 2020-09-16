
public class Dove extends Bird {
	public Dove() {
		strName = "";
	}
	public Dove(String name) {
		strName = name;
	}
	public void makePeace() {
		System.out.println(strName+" 평화의 상징은 아니고 도시에서 많이보이는 것");
	}
	
	public void fly() {
		super.fly();
		System.out.println("후욱후욱 우리 "+strName+" 무거워서 날수 없다능");
	}
}
