
public class Chicken {
//	�Ӽ�
	private String m_strName;
	private int m_iPrice;
	
//	����
//	������(�⺻, �����ε�)
	public Chicken() {
		m_strName = "";
		m_iPrice = 0;
		
	}
	public Chicken(String strname,int iPrice){
		m_strName = strname;
		m_iPrice = iPrice;
	}
	public String getName() {
		return m_strName;
	}
	public int getPrice() {
		return m_iPrice;
	}
	public void cook() {
		System.out.println("ġŲ�� ���� �����̵尡 ���� ����? ������");
	}
	public void jin() {
		System.out.println("������ �׾˸� �̰� ���� ? ����");
	}
}
