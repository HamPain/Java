
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
		Tv t; // ��ü���� t ����
		t = new Tv(); // ������ �Լ� ȣ��� ��ü �޸� �Ҵ� t �� �����ؼ� �ν��Ͻ�ȭ �Ѵ�.
		Tv T1 = new Tv(6,5,false);
		System.out.println("���� ü�� : "+T1.getM_iCh());
		T1.setM_iCh(59);
		System.out.println("�ٲ� ü�� : "+T1.getM_iCh());
			
	}
}
