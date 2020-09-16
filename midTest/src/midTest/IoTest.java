package midTest;

import java.util.Scanner;

public class IoTest {

	public static void main(String[] args) {
//		입력값은 함수에서
//		계산은 메인에서 
		
		Scanner s = new Scanner(System.in);
		int a = 0;
		a = mid(s);
		int b = 0 ;
		b = mid(s);
		
		if( a < b ) {
			System.out.println("a값이 b값보다 낮아 나눌수 없습니다");
		}
		else {
			System.out.println("첫번쨰 입력값으로 나눈 값은 이것 입니다. :");
			System.out.print(a/b);
		}
		s.close();
	}
	public static int mid(Scanner s) {
		int number = 0;
		
		System.out.println(" 입력값을 입력해주세요.");
//		스캐너 사용이 다 끝나면 클로즈 를 적어줄것
		
		return number = s.nextInt();
	
	
		
	}

}
