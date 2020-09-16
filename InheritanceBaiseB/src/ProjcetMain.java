
public class ProjcetMain {

	public static void main(String[] args) {
		//is-a 관계
//		Chiken c2 = new Chiken("원수 소갈비 소닭");
//		c2.cook();
//		c2.fly();445
//		is-a 관계란?
//		"자식은 부모다" 라는 말이 성립됨을 증명하는 것이다
//		자식 객체를 부모객체 형태로 저장할수있다
		Bird b1 = new Chiken("깐푸"); //Up-Casting(업 캐스팅)
		
		
//		b1.cook(); 업캐스팅이 되면 자식의 고유 기능은 숨겨진다. 즉 자식의 메서드는 호출이 불가능 하다.
//		그러나 오버라이딩된 함수의 부모의 고유 멤버는 호출 가능하다.
//		오버라이딩 된 함수는 부모의 함수보다 자식의 함수가 우선권을 갖는다.
//		따라서 아래의 fly()는 자식의 fly()함수가 호출된다.
		
		b1.fly();
		
//		단 반대의 대입은 안된다\
//		Chiken c3 = b1;
		Chiken c3 = (Chiken)b1;
		c3.cook();
//		위의 코드가 다운 캐스팅을 수행하는 것이다.
//		단 다운 캐스팅은 업캐스팅 된 경우에만 다운할 수 있다.
		
	}
	public static void Basic() {
//		Parent p = new Parent();
//		Child c = new Child();
//		has - a 관계
//		c.sharedMethod();
//		c.strName ="자희로드롭";
		
		
	}
	public static void override() {
		Dove d = new Dove("비둘기");
		Chiken c = new Chiken("닭 그는 ...");
		
		d.fly();
		c.fly(); // 오버라이딩된 자식의 함수를 호출한다. 자식의 함수가 우선권을 갖는다.
		d.peace();
		c.cook();
	}
}
