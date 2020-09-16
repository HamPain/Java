//Handler
public class Caller {
	private Callee m_callee = null;
	private CallBack m_CallBack = null;
	
	public Caller() {
		initProc();
		setCallBack();
		waitCallBack();
	}
	
	
	// �ʱ�ȭ �Լ� : ��簴ü����
	private void initProc() {
		m_callee = new Callee();
		
		// ��ȸ�ؼ� CallBack �������̽��� ��ü�� ��������
		// ������ ���Ŀ� "(" ( �߰�ȣ) �� ���� ������ �׻��̿� �������̽��� �߻��Լ��� �������̵� �� �� �ְ� �ȴ�
		m_CallBack = new CallBack() {
			
			public void callbackMethod() {
				// ���º�ȭ�� �˸��� callBack�� �����ϸ� ó���� �۾��� �̰��� �ڵ��Ѵ�.
				if(StateInfo.m_isCondition) {
				System.out.println("���º�ȭ ���^^. Callback ����");
				StateInfo.m_isCondition = false;
				}
				
				
			}
		};
		
		
	}
	// callee���� �ڽŰ� ������ �� �ִ� ��θ� �����ϴ� �Լ� 
	private void setCallBack() {
		m_callee.setCallBack(m_CallBack); //caller �� ����� ������ callee�� �����Ѵ�.
	}
	// �ݹ� ���� ��� ���¸� ����ϴ� �Լ�
	private void waitCallBack() {
		while(true) {
			System.out.println("CallBack ���� ����Ͻʽÿ�");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
}
