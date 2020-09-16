
public class ProjcetMain {

	public static void main(String[] args) {
//		아래 코드에서 관리자 객체가 2개 이상 생성 가능하다.
//		이는 하나 이상의 객체를 통해 DB에 접속이 가능하다는 뜻이다.
//		이렇게 되면 DB의 동시 접속 상태에서 DB의 무결성에 문제가 방생할 수 있다.
//		이를 차단하기 위해 Singleton pattern으로 코드를 구성한다.
//		DBManager man1 = new DBManager();
//		DBManager man2 = new DBManager();
//		DBManager man1 = DBManager.getInstance("홍");
//		man1.readTable();
//		DBManager man2 = DBManager.getInstance("길");
//		man2.readTable();
//		DBManager man3 = DBManager.getInstance("동");
//		man3.readTable();
		NCS n1 = NCS.getInstance("손민호");
		n1.read();
		NCS n2 =  NCS.getInstance("김관호");
		n2.read();
		NCS n3 =  NCS.getInstance("함기찬");
		n3.read();
		
	}

}
