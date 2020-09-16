
public class User extends Money {
//	¼Ó¼º
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
