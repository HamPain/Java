
public class MyCalc {
//	속성
	private int iResult;
//	행위
	public MyCalc() {
		iResult = 0;
	}
	public int simpleCalc(int iNum1, int iNum2 , String oper){
		if(oper.equals("+")) 
			iResult = iNum1 + iNum2;
		
		
		
//		switch (oper) {
//		case "+":
//			iResult = iNum1 + iNum2 ;
//			break;
//		case "-":
//			iResult = iNum1 - iNum2 ;
//			break;
//		case "*":
//			iResult = iNum1 * iNum2 ;
//			break;
//		case "/":
//			try {
//				iResult = iNum1 / iNum2 ;	
//			}
//			catch(Exception e) {
//				System.out.println("I AM GROUT");
//			}
//			break;
//		default:
//			break;
//		}
		return iResult;
	}
	
}
