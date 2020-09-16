//싱글턴으로 구성
public class Manager {
	private static Manager man = null; // 정적 공유상
	private Manager() { 
		
	}
	
	public synchronized static  Manager getInstance() {
		if( man == null) {
			man = new Manager() ;
		}
		return man;
	}
	
	public void init() {
		Bank b1  = new Bank();
		b1.addUser("엘리스");
		b1.addUser("에이리스");
		b1.addUser("비리스");
		b1.addUser("시리스");

		b1.delUser("에이리스");
	}
}
