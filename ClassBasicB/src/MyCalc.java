
public class MyCalc {
	public int m_iNum1,m_iNum2;
	private int m_iResult;
	
	public void myPlus(int a , int b) {
		this.m_iNum1 = a;
		this.m_iNum2 = b;
		m_iResult = m_iNum1 + m_iNum2;
		System.out.println(m_iResult);
		
	}
	public void  myMinus(int a , int b) {
		this.m_iNum1 = a;
		this.m_iNum2 = b;
		m_iResult = m_iNum1 - m_iNum2;
		System.out.println(m_iResult);
	
	}
	public void X(int a , int b) {
		this.m_iNum1 = a;
		this.m_iNum2 = b;
		m_iResult = m_iNum1 * m_iNum2;
		System.out.println(m_iResult);
		
	}
	public void N(int a , int b) {
		this.m_iNum1 = a;
		this.m_iNum2 = b;
		m_iResult = m_iNum1 / m_iNum2;
		System.out.println(m_iResult);
		
	}
	
//------------------------------------------------------------

	public int minus() {
		m_iResult = m_iNum1 - m_iNum2;
		return m_iResult;
	}
}
