
public class ProjcetMain {

	public static void main(String[] args) {
//		has - a ���� : ���� Ŭ�������� Dove, Chicken ��ü�� ������ �ִ�.
//		Bird b1 = new Bird();
//		Dove d1 = new Dove("��ѱ�");
		Chicken c1 = new Chicken("�׳�ġŲ");
		
//		b1.fly();
//		d1.fly();
//		c1.fly();
		
//		��ĳ���� !
		Bird b = c1;
		b.fly();
		Bird b2 = new Chicken();
		
//		b.cook(); �ڽ��� ���� ����� ȣ���� �Ұ��� �ϴ� . ��ĳ���õǾ� ���� �Ǿ��⶧��
//		�ڽ��� ���� ����� ȣ�� �ϰ��� �Ѵٸ� �ٿ�ĳ���� �ؾ��Ѵ�.
		
//		�ٿ�ĳ����! 
		((Chicken)b).cook();
		Chicken c2 = (Chicken)b;
		c2.cook();
		
//		�ǽ� : ���� b2 ��ü�� �ٿ� ĳ���� �Ͽ� cook() �Լ��� ȣ���غ���
//		instanceof ������ ����!
//		�ش� �ν��Ͻ� ��ü�� Ư�� Ŭ������ ���� ������� ������ Ȯ���ϴ� ������
//		��ȯ ���� true / false �� ��ȯ�Ѵ�
		Chicken c3 = (Chicken)b2;
		c3.cook();
		
//		or
		
		((Chicken)b2).cook();
		if (b2 instanceof Dove) {
			((Dove)b2).makePeace();
		}
		else {
			((Chicken)b2).cook();
		}
	}

}
