
public class ProjcetMain {

	public static void main(String[] args) {
		int iSize = 10;
		Person pList[] = new Person[iSize];
		pList[0] = new Person();
		pList[1] = new Student("�Ա���", 1);
//		�ǽ�2 : 2�� ��ġ�� ������ ��ü�� �����Ͽ� ��ĳ���� ����
		pList[2] = new Teacher("���Ķ�");
		
		((Teacher)pList[2]) .Teach();
//		�׷��� ���� ����� �̿��ϸ� �������� �Ѱ��� �߻��Ѵ�
//		��� �����ϱ��
		if(pList[2] instanceof Teacher) {
			((Teacher)pList[2]) .Teach();
		}
	}
	
	
	public static void updowncasting() {
		Student s1 = new Student();
		s1.eat();
		s1.pSleep();
		
		Person p = s1; //Up-Casting
		Student s2 = (Student)p;
		s2.Study();
		((Student)p).Study(); //Down-Casting
//		��ĳ���� �� ��ü�� �ش� ��ü�� ���·� �ٿ�ĳ���� �Ҽ��ִ�.
//		��ĳ������ ������ ����ȯ�� �ڵ����� �̷������.
//		�ٿ�ĳ������ ������ ����ȯ�� �Ұ����ϴ�. 
//		�ݵ�� ����� ����ȯ�� ���־�� �Ѵ�.
		
		Person p2 = new Person();
		((Teacher)p2).Teach(); // �ڽ��� ���� ����� ��ĳ�������� ��������.
//		�ڽ��� ���� ����� ȣ���ϱ� ���ؼ��� �ٿ� ĳ������ �ʿ��ϴ�.
//		�ǽ� : �ڽ����� ����ȯ�Ͽ� Teach() �޼��带 ȣ���Ͻÿ�.
		
		
	}
}
