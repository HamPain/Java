
public class Calc {
	double sum2 = 0;
	double add(double a , double b , double num1) {
		
		if(num1 == 1 ){
			sum2 = ( a + b);
			
		}
		else if(num1 == 2) {
			 sum2  = (a - b);
			 
			
		}
		else if(num1 == 3) {
			 sum2 =  (a * b);
			
		}	
		else if(num1 == 4) {
			 sum2 =  (a / b); 
			
			
		}
		return sum2;
	} 
}
