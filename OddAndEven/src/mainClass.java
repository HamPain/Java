
import java.util.Scanner;

public class mainClass{ 
public static void main(String[] args) {
				System.out.println("������ �Է����ּ���");
				Scanner scan = new Scanner(System.in); // scanner scan�� ���ο� scanner�� ���� �Է¹ް�����
				int num1 = 0; //������ ����� ���ó� �ʱ�ȭ�� ����
				num1 = scan.nextInt();
				num1 = num1 / 2;
				if(num1 == 0); 
				{
					System.out.println("¦���Դϴ�.");
				}
				if(num1 == 1)
				{
					System.out.println("Ȧ���Դϴ�.");
				}
				
					scan.close();
			}

		}
//¦�� Ȧ�� �Ǻ�
