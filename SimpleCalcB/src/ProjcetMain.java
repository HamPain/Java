//������Ʈ�� ������ : IO�� Calc ��ü�� ���´�.
//�� ��ü�� ����� �̿��Ͽ� ���ϴ� ����� �򵵷� �����ϴ� Ŭ����
public class ProjcetMain {

	public static void main(String[] args) {
		MyCalc cal = new MyCalc();
		MyIO io = new MyIO(); 
		System.out.println("����� " + cal.simpleCalc(io.getInt(), io.getInt(), io.getStr()));
		
	}

}





