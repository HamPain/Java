import java.util.Scanner;

public class MyIO {
//	�Ӽ�
	private Scanner mScan =null;
//	����
	public MyIO() { //������
//		�ɹ������� �ʱ�ȭ
		mScan = new Scanner(System.in);
		
	}
	public void fin() {
		mScan.close();
	}
	public int getInt() {
		System.out.print("������ �Է����ּ��� : ");
		int iInput = 0;
		try {
			iInput = Integer.parseInt(mScan.next());
		}
		catch(Exception e) {
		}
		
		return iInput;
	}
	public String getStr() {
		System.out.print("������ �Է�: ");
//		String str = mScan.next(); 
		return mScan.next();
	} 
	public void prnData() {
		System.out.println("  ");
	}
}
