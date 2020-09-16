
public class Person {
//	속성
	protected String strName;
	protected int iAge;
	
//	행위
	public Person() {
		strName ="human";
		iAge = 0 ;
	}
	
	public void eat() {
		System.out.println(strName+" 이(가) 먹는다.");
	}
	public void pSleep() {
		System.out.println(strName+" 이(가) 잔다.");
	}
}
