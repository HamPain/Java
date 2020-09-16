import java.util.ArrayList;

public class MyQueue {


public ArrayList list = null; 


public void enqeueu(String str) {
	if(list.size() < 10 || list.size()>=0) { // 사이즈를 10으로 지정해줌 
		 list.add(str); //  list 라는 arraylist에 받은값을 넣어줌
	}
   
}

public void deqeueu() {
   if(!list.isEmpty()) // 만약 list 객체가 빈값이 아니면 실행
      list.remove(0); // list.remove(0) 하면 선입선출이 된다 
   else  // 아니라면 밑의 출력문 실행
      System.out.println("큐가 비었습니다."); 
}

public void prnList() { // list의 모든 값을 print하는 메소드
   for (int i = 0; i < list.size(); i++) { // i를0부터 list size 까지 더하며 실행
		System.out.println(list.get(i)); // i 값에 맞춰 하나씩 출력
	}
}
}
