
public class Student extends Person{
//	�Ӽ�
	public int iNum;
	
	public Student() {
		iNum = 0;
		strName = "Student";
	}
	
	public Student(String newName , int newiNum) {
		iNum = newiNum;
		strName = newName;
	}
	public void Study() {
		System.out.println(strName+" ��(��) �����Ѵ�.");
	}
//	override(�������̵�) : ��ӹ��� �޼ҵ带 ������
	public void pSleep() {
		super.pSleep();     //c++������ �̷��� ����Ѵ�.  Person :: pSleep();
		System.out.println(strName+" ��(��) ����Ⱓ ���� ���� �ּ�ȭ �Ѵ�. ( ���ƴ�. )");
	}
}
