
public class ProjcetMain {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		PlayVedio v = new PlayVedio();
//		������ ��ü�� �����ϱ� ���ؼ��� state() �Լ��� �̿��Ѵ�.
//		���������� run() �޼��带 ȣ������ �ʴ´�.
		v.start();
	
		
		
		
		Runnable a = new PlayAudio();
//		�������̽��� ��ĳ������ �Ҽ��ִ�.
//		���� ��ü�� ���� �����尡 �ƴϴ� 
//		������� ����� �־�� �Ѵ�.
//		�Ʒ��� ���� ������ ��ü�� �����ϴ� ������ �����ڿ� A ��ü�� �����Ͽ� ������ȭ �Ѵ�.
		Thread aThread = new Thread(a);
//		���� �����带 ���۽�ų ��쿡�� isAlive�� ������� �ʴ´� .
//		Ȯ���ϴ��� ��ȯ���� false�̴�. 

		v.start();
		aThread.start();
		v.suspend();
		aThread.suspend();
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i + " ���� ������");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		v.resume();
		aThread.resume();
		
//		�������� ������ �Ϸ�Ǹ� ( ������ ������ run�޼����� �۾��� ������ run �Լ��� ����� )
//		�ش� ������� ���̻� ����� �Ұ��� �ϴ�.
//		���� �������� ���¸� Ȯ���ϰ� ��� ������ ���¸� �����带 �ٽ� �����Ҽ� �ִ�.
//		if(v.isAlive())  //isAlive() �޼���� ������ ���¸� Ȯ���ϰ� t/f �� ��ȯ�Ѵ�.
//			v.start();
//			
//		if(aThread.isAlive())
//			aThread.start();
	}

}
