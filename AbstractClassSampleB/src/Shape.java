//클래스 선언안에 abstract 키워드를 붙여 추상 클래스임을 표시한다.
//추상 클래스를 이용하여 객체를 생성할 수 없다.
//추상 클래스는 적어도 하나 이상의 추상 함수 (메서드)를 포함해야하한다.
//추상 함수는 함수의 모형 (모양) 만 있고 실제 몸체의 구현부가 없다.
//추상 클래스는 상속이 가능하다
//추상 클래스를 상속받은 자식 클래스에서 추상 클래스의 추상 함수를 재정의 해야한다.
public abstract class Shape { 
	protected String shapeName;
	
	public Shape() {
		
	}
//	아래는 추상 함수 2개를 선언한 것이다.
	public abstract double getSize();
	public abstract void draw();
	
//	추상 클래스라고 해서 모든 멤버 함수(메서드)가 모두 추상일 필요는 없다.
//	일반 함수를 포함할 수 있다.
	public void setShapeName(String newName) {
		
		
	}
}
