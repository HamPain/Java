
public abstract class Person {
	public String strName;
	
	public void play() {
		System.out.println("bHC 뿌링클 치킨");
	}
	
	public abstract void work(); // 추상함수
//	구현부분이 없음. 상속받은 쪽에서 재정의를 해줘야 한다.
	
}
