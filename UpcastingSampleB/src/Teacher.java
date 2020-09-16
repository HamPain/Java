public class Teacher extends Person {
	public Teacher() {
		
	}
	public Teacher(String newName) {
		strName = newName;
	}
	public void Teach() {
		System.out.println(strName+" 선생님이 가르친다");
	}
}
