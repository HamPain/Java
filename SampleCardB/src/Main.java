
public class Main {

	public static void main(String[] args) {
		tCard();
	}
	

	
	
	public static void tCard() {
		Card c1 = new Card('a',(short) 7,false);
		System.out.println("ī���� �����"+c1.getMoyung()+"�Դϴ�");
		System.out.println("ī���� ��ȣ��"+c1.getCardNumber()+"�Դϴ�");
		System.out.println("ī��� "+ c1.getS1() +"�Դϴ�.");
	}
}
