
public class ProjcetMain {

	public static void main(String[] args) {
		//is-a ����
//		Chiken c2 = new Chiken("���� �Ұ��� �Ҵ�");
//		c2.cook();
//		c2.fly();445
//		is-a �����?
//		"�ڽ��� �θ��" ��� ���� �������� �����ϴ� ���̴�
//		�ڽ� ��ü�� �θ�ü ���·� �����Ҽ��ִ�
		Bird b1 = new Chiken("��Ǫ"); //Up-Casting(�� ĳ����)
		
		
//		b1.cook(); ��ĳ������ �Ǹ� �ڽ��� ���� ����� ��������. �� �ڽ��� �޼���� ȣ���� �Ұ��� �ϴ�.
//		�׷��� �������̵��� �Լ��� �θ��� ���� ����� ȣ�� �����ϴ�.
//		�������̵� �� �Լ��� �θ��� �Լ����� �ڽ��� �Լ��� �켱���� ���´�.
//		���� �Ʒ��� fly()�� �ڽ��� fly()�Լ��� ȣ��ȴ�.
		
		b1.fly();
		
//		�� �ݴ��� ������ �ȵȴ�\
//		Chiken c3 = b1;
		Chiken c3 = (Chiken)b1;
		c3.cook();
//		���� �ڵ尡 �ٿ� ĳ������ �����ϴ� ���̴�.
//		�� �ٿ� ĳ������ ��ĳ���� �� ��쿡�� �ٿ��� �� �ִ�.
		
	}
	public static void Basic() {
//		Parent p = new Parent();
//		Child c = new Child();
//		has - a ����
//		c.sharedMethod();
//		c.strName ="����ε��";
		
		
	}
	public static void override() {
		Dove d = new Dove("��ѱ�");
		Chiken c = new Chiken("�� �״� ...");
		
		d.fly();
		c.fly(); // �������̵��� �ڽ��� �Լ��� ȣ���Ѵ�. �ڽ��� �Լ��� �켱���� ���´�.
		d.peace();
		c.cook();
	}
}
