
public class Bird {
//	속성 : 멤버 면수
	public String strName;
//	행위 : 멤버 함수
	public Bird() {
//		기본 생성자 : 생성자 역시 함수이다 변화이 없는 함수
//		생성자 역시 오버로딩 가능하다
//		오버로딩 조건 : 변환 유형과 관계없음! 매개변수가 달라야 한다.
		strName = "";
	}
	public Bird(String name) {
		strName = name;
//		this.strName = name; 위와 같은 문장 
	}
	public void fly() {
		System.out.println(strName +"는 날수 있다.");
		
	}
	public void sing() {
		System.out.println(strName +"는 노래한다");
		
	}
}
