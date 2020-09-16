//Handler
public class Caller {
	private Callee m_callee = null;
	private CallBack m_CallBack = null;
	
	public Caller() {
		initProc();
		setCallBack();
		waitCallBack();
	}
	
	
	// 초기화 함수 : 모든객체생성
	private void initProc() {
		m_callee = new Callee();
		
		// 우회해서 CallBack 인터페이스를 객체로 생성하자
		// 생성자 이후에 "(" ( 중괄호) 를 열고 닫으면 그사이에 인터페이스의 추상함수를 오버라이딩 할 수 있게 된다
		m_CallBack = new CallBack() {
			
			public void callbackMethod() {
				// 상태변화를 알리는 callBack을 수신하면 처리할 작업을 이곳에 코드한다.
				if(StateInfo.m_isCondition) {
				System.out.println("상태변화 됬다^^. Callback 수신");
				StateInfo.m_isCondition = false;
				}
				
				
			}
		};
		
		
	}
	// callee에게 자신과 소통할 수 있는 통로를 설정하는 함수 
	private void setCallBack() {
		m_callee.setCallBack(m_CallBack); //caller 와 통신할 연결을 callee에 설정한다.
	}
	// 콜백 수신 대기 상태를 출력하는 함수
	private void waitCallBack() {
		while(true) {
			System.out.println("CallBack 수신 대기하십시요");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
}
