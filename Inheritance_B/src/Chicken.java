
public class Chicken extends Bird {
	public Chicken() {
		strName = "";
	}
	public Chicken(String name) {
		strName = name;
	}
	public void cook() {
		System.out.println(strName+" ġŲ�� ���� ������ �ְ���");
	}
	public void fly() { // �θ��� �������̵�  : �θ��� ����� �ڽĿ��� ������
		System.out.println(strName +" ������̴� ���� ���� ���ٰ�..");
	}
}
