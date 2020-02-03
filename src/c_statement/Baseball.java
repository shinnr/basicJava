package c_statement;

import java.util.Scanner;

public class Baseball {

	public static void main(String[] args) {
		// 숫자야구게임을 만들어주세요
		//세자리수 한 번에 받기
		Scanner sc = new Scanner(System.in);
		
		int num1 = (int)(Math.random()*9)+1;
		int num2 = (int)(Math.random()*9)+1;
		int num3 = (int)(Math.random()*9)+1;
//			if(num1 == num2){
//				num2 = (int)(Math.random()*9)+1;
//			}
//		int num3 = (int)(Math.random()*9)+1;
//			if(num2 == num3 || num1 == num3){
//				num3 = (int)(Math.random()*9)+1;
//			}
		
		do{
			num2 = (int)(Math.random()*9)+1;
		}while(num1 == num2);
		do{
			num3 = (int)(Math.random()*9)+1;
		}while(num2 == num3 || num1 == num3);
						
		
		System.out.print(num1);
		System.out.print(num2);
		System.out.print(num3);
		System.out.println();
		
		while(true){
			System.out.println("세자리 수를 입력해주세요.>");
			int strike = 0;
			int ball = 0;
			int out = 0;
			
//			int a = Integer.parseInt(sc.next());
//			int b = Integer.parseInt(sc.next());
//			int c = Integer.parseInt(sc.next());
//			
//			System.out.print(a);
//			System.out.print(b);
//			System.out.print(c);
//			System.out.println();
			int input = Integer.parseInt(sc.next());
			
			int c = input%10;
			input = input/10;
			
			int b= input%10;
			input = input/10;
			
			int a = input%10;
			
			if(num1 == a){
				strike++;
			}else if(num1 == b){
				ball++;
			}else if(num1 == c){
				ball++;
			}else{
				out++;
			}
			if(num2 == a){
				ball++;
			}else if(num2 == b){
				strike++;
			}else if(num2 == c){
				ball++;
			}else{
				out++;
			}
			if(num3 == a){
				ball++;
			}else if(num3 == b){
				ball++;
			}else if(num3 == c){
				strike++;
			}else{
				out++;
			}
			System.out.println(strike + " strike " + ball + " ball " + out + " out ");
			
			if(strike == 3){
				System.out.println("정답입니다!");
				break;
			}
		}	
		
	}

}
