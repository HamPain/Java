public class DBManager {
//	속성
	private static String strName;
	private static DBManager man1 = null;
//	행위
	
	private DBManager() {
		strName = "기본 관리자";
	}
	private DBManager(String name) {
		strName = name;
	}
	
	
	public void  readTable() {
		System.out.println(strName+": 읽는 중...");	
	}
	public void writeTable() {
		System.out.println(strName+": 쓰는 중...");	
	}
//	아래 함수는 현재 클래스 내부에서 자신 타입의 객체를 생성하고해당 객체를 반환해주는 기능을 갖는다.
	public static DBManager getInstance(String name) {
		if( man1 == null) {
		man1 = new DBManager(name);
		}
		return man1;
	}
}
