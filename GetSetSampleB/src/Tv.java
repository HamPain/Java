
public class Tv {
//	속성
//	private 속성의 맴버 변수는 객체 외부에서 접근이 안된다.
//	해당 객체 내부에서만 접근이 가능한 숨겨진 개인 공간의 변수가 된다.
	private int m_iCh;
	private int m_iVol;
	private boolean m_isOn;
	
//	행위
	
//	기본 생성자는 생략이 가능하다
	 public Tv(){
		System.out.println("tv 클래스 기본 생성자 호출");
		m_iCh = 0;
		m_iVol = 0;
		m_isOn = false;
	 }
//	 생성자 오버로딩 : 반환유형과는 관게 없음 매개변슈의 대수 타입과 관련있음
	 public Tv(int iCh, int iVol,boolean isOn) {
//		 this 포인터 객체는 맴버변수, 맴버함수를 참조하는 참조객체이다
		this.m_iCh = iCh;
		this.m_iVol = iVol;
		this.m_isOn = isOn;
	 }
//	맴버 변수 iCh 값을 읽어오거나 저장하는 get set 함수 생성 
	public int getM_iCh() {
		return m_iCh;
	}
	public void setM_iCh(int m_iCh) {
		this.m_iCh = m_iCh;
	}
	public int getM_iVol() {
		return m_iVol;
	}
	public void setM_iVol(int m_iVol) {
		this.m_iVol = m_iVol;
	}
	
	public boolean setPower() {
		if (m_isOn = false) {
			m_isOn = true;
		}
		else
			m_isOn = false;
		return m_isOn;
	}

}
