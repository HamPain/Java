
public class ProjcetMain {

	public static void main(String[] args) {
		int iSize = 10;
		Person pList[] = new Person[iSize];
		pList[0] = new Person();
		pList[1] = new Student("함기찬", 1);
//		실습2 : 2번 위치에 선생님 객체를 생성하여 업캐스팅 대입
		pList[2] = new Teacher("김파랑");
		
		((Teacher)pList[2]) .Teach();
//		그러나 위의 방식을 이용하면 문제점이 한가지 발생한다
//		어떠한 문제일까요
		if(pList[2] instanceof Teacher) {
			((Teacher)pList[2]) .Teach();
		}
	}
	
	
	public static void updowncasting() {
		Student s1 = new Student();
		s1.eat();
		s1.pSleep();
		
		Person p = s1; //Up-Casting
		Student s2 = (Student)p;
		s2.Study();
		((Student)p).Study(); //Down-Casting
//		업캐스팅 된 객체만 해당 객체의 형태로 다운캐스팅 할수있다.
//		업캐스팅은 묵시적 형변환이 자동으로 이루워진다.
//		다운캐스팅은 묵시적 형변환이 불가능하다. 
//		반드시 명시적 형변환을 해주어야 한다.
		
		Person p2 = new Person();
		((Teacher)p2).Teach(); // 자식의 고유 기능은 업캐스팅으로 숨겨진다.
//		자식의 고유 기능을 호출하기 위해서는 다운 캐스팅이 필요하다.
//		실습 : 자식으로 형변환하여 Teach() 메서드를 호출하시요.
		
		
	}
}
