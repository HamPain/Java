//�̱������� ����
public class Manager {
	private static Manager man = null; // ���� ������
	private Manager() { 
		
	}
	
	public synchronized static  Manager getInstance() {
		if( man == null) {
			man = new Manager() ;
		}
		return man;
	}
	
	public void init() {
		Bank b1  = new Bank();
		b1.addUser("������");
		b1.addUser("���̸���");
		b1.addUser("�񸮽�");
		b1.addUser("�ø���");

		b1.delUser("���̸���");
	}
}
