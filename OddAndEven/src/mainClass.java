
import java.util.Scanner;

public class mainClass{ 
public static void main(String[] args) {
				System.out.println("정수를 입력해주세요");
				Scanner scan = new Scanner(System.in); // scanner scan눈 새로운 scanner의 값을 입력받게해줌
				int num1 = 0; //변수를 선언과 동시네 초기화를 해줌
				num1 = scan.nextInt();
				num1 = num1 / 2;
				if(num1 == 0); 
				{
					System.out.println("짝수입니다.");
				}
				if(num1 == 1)
				{
					System.out.println("홀수입니다.");
				}
				
					scan.close();
			}

		}
//짝수 홀수 판별
