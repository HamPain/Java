
public class ProjectMain {

	public static void main(String[] args) {
		Chicken c1 ;
		c1 = new Chicken("BHC",59000);
		System.out.println(c1.getName());
		System.out.println(c1.getPrice());
		c1.cook();
		c1.jin();
	}	
	
	public static void tvTestCode() {
		Tv t; // 객체변수 t 선언
		t = new Tv(); // 생성자 함수 호출로 객체 메모리 할당 t 에 대입해서 인스턴스화 한다.
		Tv T1 = new Tv(6,5,false);
		System.out.println("현재 체널 : "+T1.getM_iCh());
		T1.setM_iCh(59);
		System.out.println("바뀐 체널 : "+T1.getM_iCh());
			
	}
}
