
public class ProjcetMain {

	public static void main(String[] args) {
//		�Ʒ� �ڵ�� ���� �߻�Ŭ������ Shape��ü�� ���� �Ұ��� �ϴ�.
//		Shape s1 = new Shape();
//		���Ͱ��� �߻� Ŭ������ ��ü�� ������ �� ���� ������ 
//		�߻� Ŭ������ ���� �ִ� �߻� �Լ��� �ϴ� ���� �������� �𸣰� �����̴�.
//		�߻� �Լ��� ��� ���� �ڽ� Ŭ�������� ������ (implements)���̴�.
		
		
//		�ǽ� : shape Ŭ������ ��ӹ��� circle Ŭ������ ����� 
//		�߻��Լ��� �������̵� �Ͽ� ��ü�� �����Ͻÿ�
		
		MyRect r1 = new MyRect();
		Circle c1 = new Circle();
//		�߻� Ŭ������ ��ӹ��� �ڽ� Ŭ������ ��ü�� ��ĳ������ �Ҽ��ִ�.
		Shape s1 = r1;
		s1.draw();
		Shape s2 = c1;
		s2.draw();
		
		
	}

}
