import java.util.ArrayList;

public class MyStack {
//	����Ʈ�� NULL������ �ʱ�ȭ
   public ArrayList list = null; 
   
   public MyStack() {
	   list = new ArrayList(); //list �� arraylist ��ü ���� 
	   push("ȫ�浿"); //�޼ҵ� Ǫ���� ���� , ���� ȫ�浿�� �־���
	   push("�Ա���"); //�޼ҵ� Ǫ���� ���� , ����  �Ա����� �־���
	   pop(); //�޼ҵ� ���� ���� , ���� �ֱٰ� �Ա��� �̶�� ���� ����
	   prnList(); // ��� ����Ʈ�� ���
   }
 
   public void push(String str) {
      list.add(str);  //  list ��� arraylist�� �������� �־���
   }
   
   public void pop() {
      if(!list.isEmpty()) // ���� list ��ü�� ���� �ƴϸ� ����
         list.remove(list.size() - 1); //  list ��� arraylist�� ����Ʈ ������� 1���� �ڸ��� �ִ� ���� ����
      else  // �ƴ϶�� ���� ��¹� ����
         System.out.println("������ ������ϴ�."); 
   }
   
   public void prnList() { // list�� ��� ���� print�ϴ� �޼ҵ�
      for (int i = 0; i < list.size(); i++) { // i��0���� list size ���� ���ϸ� ����
		System.out.println(list.get(i)); // i ���� ���� �ϳ��� ���
	}
   }
}
