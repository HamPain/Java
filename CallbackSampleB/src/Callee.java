//moniter
public class Callee {
	// Caller 와 연결된 통로 ( 인터페이스 ) 대화 수단이 된다.
	private CallBack m_callBack;
	
	// 이 연결 통로는 caller
	public void setCallBack(CallBack callBack) {
		m_callBack = callBack;
		
		if(m_callBack != null) {
			stateMonitering();
		}
	}
	
	
	
	private void stateMonitering() {
		//Thread로 stateInfo의 적정 변수를 지속적으로 확인한다.
		
		Thread thread = new Thread( new Runnable() {
			
			public void run() {
				// 이곳에서 stateInfo 상태를 확인한다
				int iCnt = 0;
				while(true) {
					
					try {
						iCnt ++;
						if(iCnt % 5 == 0) {
							StateInfo.m_isCondition = true;
	
						}
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					// 상태 모니터링 
					checkCandition();
				}
			}
		});
		thread.start();
	}
	private void checkCandition() {
		if(m_callBack != null && StateInfo.m_isCondition) {
			m_callBack.callbackMethod();
		}
	}
}
