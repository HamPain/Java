
public class Dove extends Bird{
	
	// 기본 생성자
	public Dove() {
		
	}
	// 생성자 오버로딩
	public Dove(String newName) {
		name = newName;
	}
	public void peace() {
		System.out.println("비둘기는 전쟁의 상징");
	}
	public void fly() {
		super.fly();
		System.out.println("도시 비둘기는 주로 똥싼다 ");
		
	}
}
