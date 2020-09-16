//정적 멤버 변수 선언 : 이 변수의 상태값을 Callee 즉 모니터에서 지속적으로 감시함
//상태변화가 감지되면 Caller에게 알려줄것입니다.
//그러나 이 말만 믿고 Caller가 작업을 한다면 확실성이 떨어짐으로 
//따라서 Caller에서도 이 상태값을 확인해야한다.
public class StateInfo {
	public static boolean m_isCondition = false;
	
		
}
