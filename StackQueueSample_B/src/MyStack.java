import java.util.ArrayList;

public class MyStack {
//	리스트를 NULL값으로 초기화
   public ArrayList list = null; 
   
   public MyStack() {
	   list = new ArrayList(); //list 에 arraylist 객체 생성 
	   push("홍길동"); //메소드 푸쉬를 실행 , 값은 홍길동을 넣어줌
	   push("함기찬"); //메소드 푸쉬를 실행 , 값은  함기찬을 넣어줌
	   pop(); //메소드 팝을 실행 , 제일 최근값 함기찬 이라는 값이 나옴
	   prnList(); // 모든 리스트를 출력
   }
 
   public void push(String str) {
      list.add(str);  //  list 라는 arraylist에 받은값을 넣어줌
   }
   
   public void pop() {
      if(!list.isEmpty()) // 만약 list 객체가 빈값이 아니면 실행
         list.remove(list.size() - 1); //  list 라는 arraylist에 리스트 사이즈보다 1낮은 자리에 있는 값을 꺼냄
      else  // 아니라면 밑의 출력문 실행
         System.out.println("스택이 비었습니다."); 
   }
   
   public void prnList() { // list의 모든 값을 print하는 메소드
      for (int i = 0; i < list.size(); i++) { // i를0부터 list size 까지 더하며 실행
		System.out.println(list.get(i)); // i 값에 맞춰 하나씩 출력
	}
   }
}
