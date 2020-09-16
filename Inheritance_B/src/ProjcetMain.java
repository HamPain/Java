
public class ProjcetMain {

	public static void main(String[] args) {
//		has - a 관계 : 현재 클래스에서 Dove, Chicken 객체를 가지고 있다.
//		Bird b1 = new Bird();
//		Dove d1 = new Dove("비둘기");
		Chicken c1 = new Chicken("네네치킨");
		
//		b1.fly();
//		d1.fly();
//		c1.fly();
		
//		업캐스팅 !
		Bird b = c1;
		b.fly();
		Bird b2 = new Chicken();
		
//		b.cook(); 자식의 고유 기능흔 호출이 불가능 하다 . 업캐스팅되어 히든 되었기때문
//		자식의 고유 기능을 호출 하고자 한다면 다운캐스팅 해야한다.
		
//		다운캐스팅! 
		((Chicken)b).cook();
		Chicken c2 = (Chicken)b;
		c2.cook();
		
//		실습 : 위의 b2 객체를 다운 캐스팅 하여 cook() 함수를 호출해보자
//		instanceof 연산자 사용법!
//		해당 인스턴스 객체가 특정 클래스로 부터 만들어진 것인지 확인하는 연산자
//		반환 값은 true / false 를 반환한다
		Chicken c3 = (Chicken)b2;
		c3.cook();
		
//		or
		
		((Chicken)b2).cook();
		if (b2 instanceof Dove) {
			((Dove)b2).makePeace();
		}
		else {
			((Chicken)b2).cook();
		}
	}

}
