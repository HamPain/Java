package ¸¶¸§¸ð;

import java.util.Scanner;

public class View {
	Scanner s1 = new Scanner(System.in);
	int size;
	int num =1;
	int cnt =0;
	int chk =0;
	boolean nine=true;
	View() {
	}
	
	public void rhombus() {
		size = s1.nextInt();
		for(int i=0;i<size/2;i++)
			System.out.print(" ");
		System.out.println(num);
		for(int i=1;i<=size-2;i++) {
			cnt++;
			if(cnt==size-1)	break;
			if(chk==1) {	
				i-=2;
			}
			if(i>=size/2+1) {
				chk++;
				i-=2;
			}
			for (int j=1;j<=size/2-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=2*i+1;k++) {
				if(nine==true) {
					num++;
					if(num==9)	nine=false;
				}
				else {
					num--;
					if(num==1)  nine=true;
				}
				System.out.print(num);
			}
			System.out.println("");
		}
		for(int i=0;i<size/2;i++)
			System.out.print(" ");
		if(nine==true) {
			num++;
			if(num==9)	nine=false;
		}
		else {
			num--;
			if(num==1)  nine=true;
		}
		System.out.println(num);
	}
}
