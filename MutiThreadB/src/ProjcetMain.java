
public class ProjcetMain {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		PlayVedio v = new PlayVedio();
//		쓰레드 객체를 실행하기 위해서는 state() 함수를 이용한다.
//		직접적으로 run() 메서드를 호출하지 않는다.
		v.start();
	
		
		
		
		Runnable a = new PlayAudio();
//		인터페이스로 업캐스팅을 할수있다.
//		위의 객체는 아직 쓰레드가 아니다 
//		쓰레드로 만들어 주어야 한다.
//		아래와 같이 쓰레드 객체를 생성하는 과정에 생성자에 A 객체를 전달하여 쓰레드화 한다.
		Thread aThread = new Thread(a);
//		최초 쓰레드를 동작시킬 경우에는 isAlive를 사용하지 않는다 .
//		확인하더라도 반환값은 false이다. 

		v.start();
		aThread.start();
		v.suspend();
		aThread.suspend();
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i + " 메인 쓰레드");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		v.resume();
		aThread.resume();
		
//		쓰레드의 동작이 완료되면 ( 쓰레드 내부의 run메서드의 작업이 끝나서 run 함수를 벗어나면 )
//		해당 쓰레드는 더이상 사용이 불가능 하다.
//		따라서 쓰레드의 상태를 확인하고 사용 가능한 상태면 쓰레드를 다시 실행할수 있다.
//		if(v.isAlive())  //isAlive() 메서드는 스레드 상태를 확인하고 t/f 를 반환한다.
//			v.start();
//			
//		if(aThread.isAlive())
//			aThread.start();
	}

}
