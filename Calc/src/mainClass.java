import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {
		double a ,b ,num1 = 0;
		Calc ab = new Calc();
		Scanner scan = new Scanner(System.in);
		while(true) {
		System.out.println("a값을 입력해주세요");
		a = scan.nextDouble();
		System.out.println("b값을 입력해주세요");
		b = scan.nextDouble();
		System.out.println("연산자를 골라주세요 1) +  2) - 3) * 4) / ");
		num1 = scan.nextDouble();
		
		
		double sum2 = ab.add(a,b,num1);
		
		System.out.println (sum2);
		System.out.print ("결과값은");
		
		}
		

	}

}

