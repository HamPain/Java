
public class Chiken extends Bird {

	
	public Chiken() {
		
	}
	public Chiken(String newName) {
		name = newName;
	}
	public void cook() {
		System.out.println("ġŲ�� �����̳�");
	}
//	�θ��� fly() �� �ڽ��ʿ� ������ �Ѱ��̴�
//	�̰��� �������̵��̴�.
//	��Ģ: �θ��� �Լ��� ������ �Ϻ��� ��ġ�ؾ��Ѵ�.
	
	public void fly() {
		super.fly(); // �θ��� ����� �����ϴ� �������� : super Ű���� 
		System.out.println(name+" ġŲ�� �Ǿ���...");
		
	}
}
