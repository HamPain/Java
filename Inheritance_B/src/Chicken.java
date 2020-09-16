
public class Chicken extends Bird {
	public Chicken() {
		strName = "";
	}
	public Chicken(String name) {
		strName = name;
	}
	public void cook() {
		System.out.println(strName+" 치킨은 역시 순살이 최고지");
	}
	public void fly() { // 부모의 오버라이딩  : 부모의 기능을 자식에서 재정의
		System.out.println(strName +" 오토바이는 큿소 날수 없다고..");
	}
}
