
public class Bird {
//	�Ӽ� : ��� ���
	public String strName;
//	���� : ��� �Լ�
	public Bird() {
//		�⺻ ������ : ������ ���� �Լ��̴� ��ȭ�� ���� �Լ�
//		������ ���� �����ε� �����ϴ�
//		�����ε� ���� : ��ȯ ������ �������! �Ű������� �޶�� �Ѵ�.
		strName = "";
	}
	public Bird(String name) {
		strName = name;
//		this.strName = name; ���� ���� ���� 
	}
	public void fly() {
		System.out.println(strName +"�� ���� �ִ�.");
		
	}
	public void sing() {
		System.out.println(strName +"�� �뷡�Ѵ�");
		
	}
}
