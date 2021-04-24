//extends : 확장하다
//자바는 단일 상속을 원칙으로 한다. 다중 상속 지원 안함
//c++ 는 다중상속을 지원한다
//자바는 단일 상속의 문제를 해결하기 위해 implemants (구현) 을 이용하여 다중 상속을 지원한다

public class Child extends Parent {
	
	public Child() {
		this.strName = "나는 시험을 안보고 게임을 한게 맞다.";
		System.out.println("자식 생성자 호출");
		
	}
}
