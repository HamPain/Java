
public class NCS {
	private String name;
	private static NCS n1 = null;
	private NCS() {
		name = "��ġ ������";
	}
	private NCS(String newName) {
		name = newName;
	}
	
	public void read() {
		System.out.println(name +"�� �д� ��...");
	}
	public static NCS getInstance(String newName) {
		if (n1 == null) {
			n1 = new NCS(newName);
		}
		return n1;
	}
}
