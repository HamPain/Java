import java.util.Scanner;

public class MyIO {
//	속성
	private Scanner mScan =null;
//	행위
	public MyIO() { //생성자
//		맴버변수의 초기화
		mScan = new Scanner(System.in);
		
	}
	public void fin() {
		mScan.close();
	}
	public int getInt() {
		System.out.print("정수를 입력해주세요 : ");
		int iInput = 0;
		try {
			iInput = Integer.parseInt(mScan.next());
		}
		catch(Exception e) {
		}
		
		return iInput;
	}
	public String getStr() {
		System.out.print("연산자 입력: ");
//		String str = mScan.next(); 
		return mScan.next();
	} 
	public void prnData() {
		System.out.println("  ");
	}
}
