
public class Chicken {
//	속성
	private String m_strName;
	private int m_iPrice;
	
//	행위
//	생성자(기본, 오버로딩)
	public Chicken() {
		m_strName = "";
		m_iPrice = 0;
		
	}
	public Chicken(String strname,int iPrice){
		m_strName = strname;
		m_iPrice = iPrice;
	}
	public String getName() {
		return m_strName;
	}
	public int getPrice() {
		return m_iPrice;
	}
	public void cook() {
		System.out.println("치킨은 순살 프라이드가 진리 ㅇㅈ? ㅇㅇㅈ");
	}
	public void jin() {
		System.out.println("진혁이 겜알못 이거 인정 ? ㅇㅈ");
	}
}
