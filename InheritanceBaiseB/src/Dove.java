
public class Dove extends Bird{
	
	// �⺻ ������
	public Dove() {
		
	}
	// ������ �����ε�
	public Dove(String newName) {
		name = newName;
	}
	public void peace() {
		System.out.println("��ѱ�� ������ ��¡");
	}
	public void fly() {
		super.fly();
		System.out.println("���� ��ѱ�� �ַ� �˽Ѵ� ");
		
	}
}
