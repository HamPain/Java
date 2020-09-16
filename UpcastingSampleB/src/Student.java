
public class Student extends Person{
//	속성
	public int iNum;
	
	public Student() {
		iNum = 0;
		strName = "Student";
	}
	
	public Student(String newName , int newiNum) {
		iNum = newiNum;
		strName = newName;
	}
	public void Study() {
		System.out.println(strName+" 이(가) 공부한다.");
	}
//	override(오버라이딩) : 상속받은 메소드를 재정의
	public void pSleep() {
		super.pSleep();     //c++에서는 이렇게 사용한다.  Person :: pSleep();
		System.out.println(strName+" 이(가) 시험기간 동안 잠을 최소화 한다. ( 미쳤다. )");
	}
}
