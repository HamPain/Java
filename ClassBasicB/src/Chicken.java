public class Chicken {
//	맴버변수
	
	public String m_strName;
	public int m_age;
	public boolean m_isMale;
	
	
	
//	맴버함수
//	생성자 : 생성자는 함수다 단 반환 유형은 없고 클래스 이름과 동일하다 
//	생성자에 매개변수 가없는 생성자를 기본 생성자라고 한다
//	생성자의 주요 기능은 맴버 변수의 초기화와 시작 메서드의 호출이다
	public Chicken() {
		m_strName = "";
		m_age=0;
		m_isMale = false;
	}
	

//	동일한 이름의 함수를 하나 이상 만들 수 있다. -> 오버로딩 
//	단 , 반환 유형과 관계 없이 매개변수의 개수 또는 타입이 달라야한다.
	public Chicken (String name , int age ,boolean isM) {
		m_strName = name;
		m_age = age;
		m_isMale = isM;
	}
}
