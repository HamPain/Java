//moniter
public class Callee {
	// Caller �� ����� ��� ( �������̽� ) ��ȭ ������ �ȴ�.
	private CallBack m_callBack;
	
	// �� ���� ��δ� caller
	public void setCallBack(CallBack callBack) {
		m_callBack = callBack;
		
		if(m_callBack != null) {
			stateMonitering();
		}
	}
	
	
	
	private void stateMonitering() {
		//Thread�� stateInfo�� ���� ������ ���������� Ȯ���Ѵ�.
		
		Thread thread = new Thread( new Runnable() {
			
			public void run() {
				// �̰����� stateInfo ���¸� Ȯ���Ѵ�
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
					// ���� ����͸� 
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
