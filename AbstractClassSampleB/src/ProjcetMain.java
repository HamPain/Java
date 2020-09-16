
public class ProjcetMain {

	public static void main(String[] args) {
//		아래 코드와 같이 추상클래스인 Shape객체를 생성 불가능 하다.
//		Shape s1 = new Shape();
//		위와같이 추상 클래스로 객체를 생성할 수 없는 이유는 
//		추상 클래스가 갖고 있는 추상 함수가 하는 일이 무엇인지 모르게 때문이다.
//		추상 함수는 상속 받은 자식 클래스에서 구현될 (implements)것이다.
		
		
//		실습 : shape 클래스를 상속받은 circle 클래스를 만들고 
//		추상함수를 오버라이딩 하여 몸체를 구현하시오
		
		MyRect r1 = new MyRect();
		Circle c1 = new Circle();
//		추상 클래스를 상속받은 자식 클래스의 객체를 업캐스팅을 할수있다.
		Shape s1 = r1;
		s1.draw();
		Shape s2 = c1;
		s2.draw();
		
		
	}

}
