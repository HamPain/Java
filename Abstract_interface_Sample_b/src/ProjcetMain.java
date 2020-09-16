
public class ProjcetMain {

	public static void main(String[] args) {
//		Person p = new Person();  추상 클래스 로는 객체 생성 불가능
		Student s = new Student();
//		추상 클래스의 부모 형태로 업캐스팅이 가능하다
		Person p = new Student();
		
		
	}

}
