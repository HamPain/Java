
public class User extends Money {
//	�Ӽ�
	private String strName;
	
	private User() {
		
	}
	public User(String name) {
		strName = name;
		
	}
	
	public String getName() {
		return strName;
	}
}
