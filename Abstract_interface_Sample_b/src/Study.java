
// 인터페이스를 다른 인터페이스 클래스에 상속시키는 경우 구현이 아닌 확장을 사용한다
// extends 키워드로 인터페이스를 확장한다.
public interface Study {//extends Runnable {
	public static int iNum =0;
	
	public void exam(); // 인터페이스의 추상함수 정의에 abstract 키워드를 생략 가능
//	abstract 키워드를 생략하면 자동으로 추상함수로 간주된다
	public static void test() {
		System.out.println("부점장 시험");
		
	}
	
}


//사용자가 만들어서 사용하는 인터페이스 이외에 라이브러리에 포함되오 있는 인터페이스가 있다.
//runnable 인터페이스가 대표적이다.