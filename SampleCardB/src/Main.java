
public class Main {

	public static void main(String[] args) {
		tCard();
	}
	

	
	
	public static void tCard() {
		Card c1 = new Card('a',(short) 7,false);
		System.out.println("카드의 모양은"+c1.getMoyung()+"입니다");
		System.out.println("카드의 번호는"+c1.getCardNumber()+"입니다");
		System.out.println("카드는 "+ c1.getS1() +"입니다.");
	}
}
