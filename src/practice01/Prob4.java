package practice01;

import java.util.Scanner;

public class Prob4 {
	public static void main(String[] args) {
		
		String str = null;
		
		System.out.print("문자열을 입력하세요. : ");
		Scanner scan = new Scanner(System.in);
		
		str = scan.nextLine();
		
		for(int i=0;i<str.length();i++){
			for(int j=0;j<i+1;j++){
				System.out.print(str.charAt(j));
			}
			System.out.println();
		}
		
		scan.close();
		

	}
}