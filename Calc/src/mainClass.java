import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {
		double a ,b ,num1 = 0;
		Calc ab = new Calc();
		Scanner scan = new Scanner(System.in);
		while(true) {
		System.out.println("a���� �Է����ּ���");
		a = scan.nextDouble();
		System.out.println("b���� �Է����ּ���");
		b = scan.nextDouble();
		System.out.println("�����ڸ� ����ּ��� 1) +  2) - 3) * 4) / ");
		num1 = scan.nextDouble();
		
		
		double sum2 = ab.add(a,b,num1);
		
		System.out.println (sum2);
		System.out.print ("�������");
		
		}
		

	}

}

