package midTest;

import java.util.Scanner;

public class IoTest {

	public static void main(String[] args) {
//		�Է°��� �Լ�����
//		����� ���ο��� 
		
		Scanner s = new Scanner(System.in);
		int a = 0;
		a = mid(s);
		int b = 0 ;
		b = mid(s);
		
		if( a < b ) {
			System.out.println("a���� b������ ���� ������ �����ϴ�");
		}
		else {
			System.out.println("ù���� �Է°����� ���� ���� �̰� �Դϴ�. :");
			System.out.print(a/b);
		}
		s.close();
	}
	public static int mid(Scanner s) {
		int number = 0;
		
		System.out.println(" �Է°��� �Է����ּ���.");
//		��ĳ�� ����� �� ������ Ŭ���� �� �����ٰ�
		
		return number = s.nextInt();
	
	
		
	}

}
