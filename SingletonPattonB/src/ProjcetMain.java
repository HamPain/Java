
public class ProjcetMain {

	public static void main(String[] args) {
//		�Ʒ� �ڵ忡�� ������ ��ü�� 2�� �̻� ���� �����ϴ�.
//		�̴� �ϳ� �̻��� ��ü�� ���� DB�� ������ �����ϴٴ� ���̴�.
//		�̷��� �Ǹ� DB�� ���� ���� ���¿��� DB�� ���Ἲ�� ������ ����� �� �ִ�.
//		�̸� �����ϱ� ���� Singleton pattern���� �ڵ带 �����Ѵ�.
//		DBManager man1 = new DBManager();
//		DBManager man2 = new DBManager();
//		DBManager man1 = DBManager.getInstance("ȫ");
//		man1.readTable();
//		DBManager man2 = DBManager.getInstance("��");
//		man2.readTable();
//		DBManager man3 = DBManager.getInstance("��");
//		man3.readTable();
		NCS n1 = NCS.getInstance("�չ�ȣ");
		n1.read();
		NCS n2 =  NCS.getInstance("���ȣ");
		n2.read();
		NCS n3 =  NCS.getInstance("�Ա���");
		n3.read();
		
	}

}
