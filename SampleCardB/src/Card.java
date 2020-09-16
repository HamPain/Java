public class Card {
	private char m_moyung;
	private short m_cardNumber;
	private boolean m_sangte ;
	private String s1;
	
	public Card() {
		m_sangte = false;
		m_cardNumber = 0;
		m_moyung ='a';
	}
	public Card(char moyung, short cardNumber , boolean sangte) {
		m_sangte = sangte;
		m_cardNumber = cardNumber;
		m_moyung = moyung;
	}
	
	public String getS1() {
		if(m_sangte = false) {
			s1 = "¾Õ¸é";
		}
		else {
			s1 = "µÞ¸é";
		}
		return s1;
	}
	public boolean isSangte() {
		return m_sangte;
	}
	public char getMoyung() {
		return m_moyung;
	}
	public short getCardNumber() {
		return m_cardNumber;
	}
}
