package 최정기;

import java.util.Scanner;

public class CTEST_06_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
		Scanner input = new Scanner(System.in);
	        System.out.print("높이 입력 : ");
	        int height = input.nextInt();
	        input.close();

	        for (int i=1;i<=height;i++) {
	            for (int j = 1; j <= height-i; j++) {
	                System.out.print(" ");
	            }
	            for(int k =1;k<=2*i-1;k++) {
	            	System.out.print("*");
	            }
	            System.out.println();
	        }
	}

}
