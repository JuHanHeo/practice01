package practice01;

import java.util.Scanner;

public class Prob3 {

	public static void main(String[] args) {
		
		int num,check,accum = 0;
		
		System.out.print("숫자를 입력하세요 : ");
		Scanner scan = new Scanner(System.in);
		
		num = scan.nextInt();
		
		check = num%2;
		
		for(int i=0;i<=num;i++){
			if(i%2==check){
				accum = accum + i;
			}
		}
		
		System.out.print("결과값 : ");
		System.out.println(accum);
		
		scan.close();
		
		
	}
}
