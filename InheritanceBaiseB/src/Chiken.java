
public class Chiken extends Bird {

	
	public Chiken() {
		
	}
	public Chiken(String newName) {
		name = newName;
	}
	public void cook() {
		System.out.println("치킨은 볼케이노");
	}
//	부모의 fly() 를 자식쪽에 재정의 한것이다
//	이것이 오버라이딩이다.
//	규칙: 부모의 함수의 모형과 완벽히 일치해야한다.
	
	public void fly() {
		super.fly(); // 부모의 멤버에 접근하는 참조변수 : super 키워드 
		System.out.println(name+" 치킨이 되었다...");
		
	}
}
