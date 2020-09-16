//프로젝트의 시작점 : IO와 Calc 객체를 갖는다.
//각 객체의 기능을 이용하여 원하는 결과를 얻도록 관리하는 클래스
public class ProjcetMain {

	public static void main(String[] args) {
		MyCalc cal = new MyCalc();
		MyIO io = new MyIO(); 
		System.out.println("결과는 " + cal.simpleCalc(io.getInt(), io.getInt(), io.getStr()));
		
	}

}





