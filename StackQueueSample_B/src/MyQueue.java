import java.util.ArrayList;

public class MyQueue {


public ArrayList list = null; 


public void enqeueu(String str) {
	if(list.size() < 10 || list.size()>=0) { // ����� 10���� �������� 
		 list.add(str); //  list ��� arraylist�� �������� �־���
	}
   
}

public void deqeueu() {
   if(!list.isEmpty()) // ���� list ��ü�� ���� �ƴϸ� ����
      list.remove(0); // list.remove(0) �ϸ� ���Լ����� �ȴ� 
   else  // �ƴ϶�� ���� ��¹� ����
      System.out.println("ť�� ������ϴ�."); 
}

public void prnList() { // list�� ��� ���� print�ϴ� �޼ҵ�
   for (int i = 0; i < list.size(); i++) { // i��0���� list size ���� ���ϸ� ����
		System.out.println(list.get(i)); // i ���� ���� �ϳ��� ���
	}
}
}
