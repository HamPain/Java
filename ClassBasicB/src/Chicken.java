public class Chicken {
//	�ɹ�����
	
	public String m_strName;
	public int m_age;
	public boolean m_isMale;
	
	
	
//	�ɹ��Լ�
//	������ : �����ڴ� �Լ��� �� ��ȯ ������ ���� Ŭ���� �̸��� �����ϴ� 
//	�����ڿ� �Ű����� ������ �����ڸ� �⺻ �����ڶ�� �Ѵ�
//	�������� �ֿ� ����� �ɹ� ������ �ʱ�ȭ�� ���� �޼����� ȣ���̴�
	public Chicken() {
		m_strName = "";
		m_age=0;
		m_isMale = false;
	}
	

//	������ �̸��� �Լ��� �ϳ� �̻� ���� �� �ִ�. -> �����ε� 
//	�� , ��ȯ ������ ���� ���� �Ű������� ���� �Ǵ� Ÿ���� �޶���Ѵ�.
	public Chicken (String name , int age ,boolean isM) {
		m_strName = name;
		m_age = age;
		m_isMale = isM;
	}
}
