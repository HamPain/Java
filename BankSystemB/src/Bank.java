
public class Bank extends Money{
//	속성
	private User userList[] = null;
	private int totalUserCnt;
	private int curIndex;
	
//	행위
	public Bank() {
		curIndex = 0;
		totalUserCnt = 10;
		userList = new User[totalUserCnt];
	}
	
	
//	계좌(사용자)를 사용자 목록에 추가
	public void addUser(String name) {
		
		if(curIndex < totalUserCnt - 1)
			userList[curIndex++] = new User(name);
	}
//	사용자 목록에서 앚는 사용자의 위치를 알려준다
//	찾으면 배열의 위치값 못찾으면 -1 반환
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
//  시험문제 (아마도 10 번 문제)	
//	미완성 : 작업 처리는 추후에
	public boolean delUser(String name) {
		boolean isOk = false;
		int index = findUser(name);
//		시프트 연산을 함으로서 삭제하고싶은 인덱스를 삭제후 한칸씩 왼쪽시프트 
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












