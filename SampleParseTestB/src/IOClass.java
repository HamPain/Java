import java.util.Scanner;

public class IOClass {
	private Scanner s ;
	public IOClass() {
		s = new Scanner(System.in);
	}
	public void fin() {
		s.close();
	}
	public void iInput() {
		System.out.println("���� �Է����ּ���");
		String str = s.nextLine();
		try{
			int iNum = Integer.parseInt(str);
			System.out.println("�Է� ���� ����: "+iNum);
		}
		catch(Exception error1) {
			try {
				double dNum = Double.parseDouble(str);	
				System.out.println("�Է� ���� ����: "+dNum);
			}
			catch(Exception error2) {
				System.out.println("�Է� ���� ����: "+str);
				
			}
		}
	
	}
}
