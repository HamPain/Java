
public class Dove extends Bird {
	public Dove() {
		strName = "";
	}
	public Dove(String name) {
		strName = name;
	}
	public void makePeace() {
		System.out.println(strName+" ��ȭ�� ��¡�� �ƴϰ� ���ÿ��� ���̺��̴� ��");
	}
	
	public void fly() {
		super.fly();
		System.out.println("�Ŀ��Ŀ� �츮 "+strName+" ���ſ��� ���� ���ٴ�");
	}
}
