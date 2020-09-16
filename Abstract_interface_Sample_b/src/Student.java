
public class Student extends Person implements Study {

	@Override
	public void work() {
		System.out.println("롯데리아가 일이다.");
		
	}

	@Override
	public void exam() {
		System.out.println("");
	}
	
	
}
