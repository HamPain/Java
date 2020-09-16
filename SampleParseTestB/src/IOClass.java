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
		System.out.println("값을 입럭해주세요");
		String str = s.nextLine();
		try{
			int iNum = Integer.parseInt(str);
			System.out.println("입력 받은 값은: "+iNum);
		}
		catch(Exception error1) {
			try {
				double dNum = Double.parseDouble(str);	
				System.out.println("입력 받은 값은: "+dNum);
			}
			catch(Exception error2) {
				System.out.println("입력 받은 값은: "+str);
				
			}
		}
	
	}
}
