
public class Tv {
//	�Ӽ�
//	private �Ӽ��� �ɹ� ������ ��ü �ܺο��� ������ �ȵȴ�.
//	�ش� ��ü ���ο����� ������ ������ ������ ���� ������ ������ �ȴ�.
	private int m_iCh;
	private int m_iVol;
	private boolean m_isOn;
	
//	����
	
//	�⺻ �����ڴ� ������ �����ϴ�
	 public Tv(){
		System.out.println("tv Ŭ���� �⺻ ������ ȣ��");
		m_iCh = 0;
		m_iVol = 0;
		m_isOn = false;
	 }
//	 ������ �����ε� : ��ȯ�������� ���� ���� �Ű������� ��� Ÿ�԰� ��������
	 public Tv(int iCh, int iVol,boolean isOn) {
//		 this ������ ��ü�� �ɹ�����, �ɹ��Լ��� �����ϴ� ������ü�̴�
		this.m_iCh = iCh;
		this.m_iVol = iVol;
		this.m_isOn = isOn;
	 }
//	�ɹ� ���� iCh ���� �о���ų� �����ϴ� get set �Լ� ���� 
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
