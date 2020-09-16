import java.util.Scanner;

public class ProjcetMain {

	public static void main(String[] args) {
//		동적 바인인 : 후기바인딩 또는 늦은 바인딩이라 한다.
//		다형성의 한 종류 이다.
//		컴파일 시점에 객체가 생성되지 않고 실행 시점에 사용자의 선택에 있어서 객체가 생성되고
//		결합된다. 즉 객체의 결합이 나중에 일어나는 것을 말한다.
		
		Scanner scan = new Scanner(System.in);
		Shape s = null;
		
		System.out.println("1. 사각형  그리기 2. 원 그리기");
		int iInput = scan.nextInt();

//		번호 식별후 개체 생성 및 저장
		switch (iInput) {
		case 1:
			s = new MyRect("사각형");
			break;
		case 2:
			s = new Mycircle("원");
		default:
			break;
		}
//		함수 (기능) 호출
		
		s.drow();
	}
	public static void staticCall() {
//		정적 바인딩 : 객체를 생성하여 해당 인스턴스가 결정된 상태
		MyRect r = new MyRect("사각");
		Mycircle c = new Mycircle("원");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1. 사각형  그리기 2. 원 그리기");
		
		int iInput = scan.nextInt();
		
//		입력 번호에 의해서 사용할 객체를 결정한다.
//		이미 1또는 2에 해당하는 객체는 R과 C로 만들어져 있는 상태이다.
//		이것은 컴파일 시점에 이미 객체가 누구인지 알고ㅓ 있다는 이야기이다.
//		이러한 방식을 정적 바인딩 이라고 하고 보편적인 프로그래밍 방식이다.
//		절차지향형 언어에서는 무조건 정적바인딩을 사용한다.
		
		switch (iInput) {
		case 1:
			r.drow();
			break;
		case 2:
			c.drow();
		default:
			break;
		}
	}
	

}
