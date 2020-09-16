
public class Money {
//	속성
	protected int iBalance;
	
	public Money() {
		iBalance = 0;
	}
//	입금
	public int deposit(String name ,int money){
		iBalance += money;
		return money;
	}
//	출금
	public boolean withDraw(String name , int money) {
		boolean isOk = false;
		if(iBalance >= money) {
			iBalance -= money;
			isOk = true;
		}
		return isOk;
	}
	public int getBalance() {
		return iBalance;
	}
}
