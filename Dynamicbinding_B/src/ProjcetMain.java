import java.util.Scanner;

public class ProjcetMain {

	public static void main(String[] args) {
//		���� ������ : �ı���ε� �Ǵ� ���� ���ε��̶� �Ѵ�.
//		�������� �� ���� �̴�.
//		������ ������ ��ü�� �������� �ʰ� ���� ������ ������� ���ÿ� �־ ��ü�� �����ǰ�
//		���յȴ�. �� ��ü�� ������ ���߿� �Ͼ�� ���� ���Ѵ�.
		
		Scanner scan = new Scanner(System.in);
		Shape s = null;
		
		System.out.println("1. �簢��  �׸��� 2. �� �׸���");
		int iInput = scan.nextInt();

//		��ȣ �ĺ��� ��ü ���� �� ����
		switch (iInput) {
		case 1:
			s = new MyRect("�簢��");
			break;
		case 2:
			s = new Mycircle("��");
		default:
			break;
		}
//		�Լ� (���) ȣ��
		
		s.drow();
	}
	public static void staticCall() {
//		���� ���ε� : ��ü�� �����Ͽ� �ش� �ν��Ͻ��� ������ ����
		MyRect r = new MyRect("�簢");
		Mycircle c = new Mycircle("��");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1. �簢��  �׸��� 2. �� �׸���");
		
		int iInput = scan.nextInt();
		
//		�Է� ��ȣ�� ���ؼ� ����� ��ü�� �����Ѵ�.
//		�̹� 1�Ǵ� 2�� �ش��ϴ� ��ü�� R�� C�� ������� �ִ� �����̴�.
//		�̰��� ������ ������ �̹� ��ü�� �������� �˰�� �ִٴ� �̾߱��̴�.
//		�̷��� ����� ���� ���ε� �̶�� �ϰ� �������� ���α׷��� ����̴�.
//		���������� ������ ������ �������ε��� ����Ѵ�.
		
		switch (iInput) {
		case 1:
			r.drow();
			break;
		case 2:
			c.drow();
		default:
			break;
		}
	}
	

}
