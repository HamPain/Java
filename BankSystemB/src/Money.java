
public class Money {
//	�Ӽ�
	protected int iBalance;
	
	public Money() {
		iBalance = 0;
	}
//	�Ա�
	public int deposit(String name ,int money){
		iBalance += money;
		return money;
	}
//	���
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
