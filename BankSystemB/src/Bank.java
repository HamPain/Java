
public class Bank extends Money{
//	�Ӽ�
	private User userList[] = null;
	private int totalUserCnt;
	private int curIndex;
	
//	����
	public Bank() {
		curIndex = 0;
		totalUserCnt = 10;
		userList = new User[totalUserCnt];
	}
	
	
//	����(�����)�� ����� ��Ͽ� �߰�
	public void addUser(String name) {
		
		if(curIndex < totalUserCnt - 1)
			userList[curIndex++] = new User(name);
	}
//	����� ��Ͽ��� �ش� ������� ��ġ�� �˷��ش�
//	ã���� �迭�� ��ġ�� ��ã���� -1 ��ȯ
	public int findUser(String name) {
		int iFoundIndex = -1;
		for (int i = 0; i < curIndex; i++) {
			if(userList[i].getName().equals(name)) {
				iFoundIndex = i;
				break;
			}
			
		}
		return iFoundIndex;
	}
//  ���蹮�� (�Ƹ��� 10 �� ����)	
//	�̿ϼ� : �۾� ó���� ���Ŀ�
	public boolean delUser(String name) {
		boolean isOk = false;
		int index = findUser(name);
//		����Ʈ ������ �����μ� �����ϰ���� �ε����� ������ ��ĭ�� ���ʽ���Ʈ 
		if(index >= 0 ) {
			userList[index] = null;
			for (int i = index; i < curIndex-1; i++) { 
				userList[i] = userList[i+1];
			}
			userList[curIndex-1] = null;
			curIndex--;
			isOk = true;
		}
		return isOk;
	}
	
	public int deposit(String name ,int money){
		int index = findUser(name);
		
		if(index >= 0)
		{
			userList[index].deposit(name, money);
			iBalance += money;
		}
		return money;
	}
	
	public boolean withDraw(String name , int money) {
		boolean isOk = false;
		int index = findUser(name);
		if(index >= 0)
		{
			if(userList[index].withDraw(name, money)){
				iBalance -= money;
				isOk = true;
			}
			
		}
		return isOk;
	}
	
}












