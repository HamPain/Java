public class DBManager {
//	�Ӽ�
	private static String strName;
	private static DBManager man1 = null;
//	����
	
	private DBManager() {
		strName = "�⺻ ������";
	}
	private DBManager(String name) {
		strName = name;
	}
	
	
	public void  readTable() {
		System.out.println(strName+": �д� ��...");	
	}
	public void writeTable() {
		System.out.println(strName+": ���� ��...");	
	}
//	�Ʒ� �Լ��� ���� Ŭ���� ���ο��� �ڽ� Ÿ���� ��ü�� �����ϰ��ش� ��ü�� ��ȯ���ִ� ����� ���´�.
	public static DBManager getInstance(String name) {
		if( man1 == null) {
		man1 = new DBManager(name);
		}
		return man1;
	}
}
