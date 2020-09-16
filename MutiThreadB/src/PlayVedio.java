
//Thread 클래스를 상속받은 PlayVedio 클래스는 그 자체가 쓰레드이다.
public class PlayVedio extends Thread {

	@Override
	public void run() {
		int i = 0;
		for (;;) {
			i ++;
			System.out.println(i + " 빈 비디오 재생");
//			쓰레드 클래스 내부에서 자신의 쓰레드 동작을 제어할 수 있다.
//			일정 시간동안 쉬었다가 다시 동작하도록 할수있다.
			try {
				sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} //괄호 사이에 값을 천분의 1초이다 . 지정한 시간동안 작업을 쉰다
		}
//		run 메서드 블럭을 벗어나면 쓰레드는 종료되낟 따라서 더이상 사용이 불가능하다.
//		그래서 쓰레드는 무한 반복으로 구성된다.
	}

//	쓰레드 클래스에 반드시 오버라이딩 해야하는 함수가 있다.
//	위의 run() 메서드를 오버라이딩하고 이 함수 구현부에 쓰레드로 동작 시킬 내용을 작성한다.
}
