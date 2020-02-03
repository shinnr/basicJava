package c_statement;

import java.util.Scanner;

public class RepetitiveStatement {

	public static void main(String[] args) {
		/*
		 * 반복문-for, while
		 * << for문 >>
		 * -for(int = 1;(초기화) i<=10;(조건식) i++(증감식)){}
		 * -for(1부터 10까지 1씩 증가하면서 반복){}
		 */
		
		for(int i = 1; i <= 10; i++){
			//for(초기화; 조건식; 증감식;){}
			//초기화 : 조건식과 증감시에 사용할 변수 초기화
			//조건식 : 연산결과가 true이면 블럭안의 내용을 수행
			//증감식 : 변수를 증가/감소시켜 반복문을 제어
			System.out.println(i + "번째 반복");//초기화한 변수를 블럭안에서 사용할 수 있다
		}
		//
		int sum = 0;//1부터 10까지 합계를 저장
		sum += 1;
		sum += 2;
		sum += 3;
		sum += 4;
		sum += 5;
		sum += 6;
		sum += 7;
		sum += 8;
		sum += 9;
		sum += 10;
		System.out.println(sum);
		//
		
		sum = 0;
		for(int i = 1; i <= 100; i++){
			sum += i;
		}
		System.out.println(sum);
		
		sum = 0;
		for(int i = 100; i >= 1; i--){//100부터 1 까지 1씩 감소하면서 반복
			sum += i;
		}
		System.out.println(sum);
		
		//1부터 100까지 짝수의 합을 구해보자
		sum = 0;
		for(int i =2; i <= 100; i+= 2){
			sum += i;
		}
		System.out.println(sum);
		
		sum = 0;
		for(int i = 1; i <= 100; i++){
			if(i % 2 == 0){
				sum += i;
			}
		}
		System.out.println(sum);
		
		//1부터 100까지 홀수의 합을 구해보자
		sum = 0;
		for(int i = 1; i <= 100; i++){
			if(i % 2 == 1){
				sum += i;
			}
		}
		System.out.println(sum);
		
		//구구단을 출력해보자.
		/*
		 * 2 * 1 = 2
		 * 2 * 2 = 4
		 * 2 * 3 = 6
		 * ...
		 */
		for(int i = 1; i <= 9; i++){
			System.out.println("2 * " + i + " = " + i * 2);
		}
		
		for(int i = 1; i <= 9; i++){
			System.out.println("9 * " + i + " = " + i * 9);
		}
		
		//구구단 전체를 출력해주세요
		for(int i = 2; i <= 9; i++){
			for(int n = 1; n <= 9; n++){			
			System.out.println(i + " * " + n + " = " + i*n);
			}
		}
		//구구단 전체의 짝수단 홀수줄만 출력해주세요
		System.out.println("짝수단 홀수줄");
		for(int i = 2; i <= 9; i+=2){
			for(int n = 1; n <= 9; n+=2){			
			System.out.println(i + " * " + n + " = " + i*n);
			}
		}
		
		System.out.println("짝수단 홀수줄2");
		for(int i = 2; i <= 9; i++){
			if(i % 2 == 0){
				for(int n = 1; n <= 9; n++){
					if(n % 2 == 1)
					System.out.println(i + " * " + n + " = " + i*n);
				}
			}
		}
		//구구단 전체를 가로로 출력해주세요
		for(int i = 1; i <= 9; i++){
			for(int n = 2; n <= 9; n++){			
				System.out.printf(n + " * " + i + " = " + i*n + "	");
			}
			System.out.println();
		}
		
		for(int i = 1; i <= 5; i++){
			for(int j = 1; j <= 10; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = 1; i <= 10; i++){
			for(int j = 1; j <= i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = 10; i >= 1; i--){
			for(int j = 1; j <= i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*
		 * << while문 >>
		 * - while(조건식){}
		 * - 조건식의 결과가 true인 동안 계속해서 반복
		 * - 반복횟수를 알 수 없을 때 사용
		 */
		
		//사용자가 입력한 단의 구구단을 출력하는 프로그램
		
//		Scanner s = new Scanner(System.in);
//		
//		while(true){
//			System.out.println("몇단을 출력할까요?(0 : 종료)");
//			int dan = Integer.parseInt(s.nextLine());
//			
//			if(dan == 0){
//				System.out.println("종료되었습니다.");
//				break;//가까운 반복문 하나를 탈출
//			}
//			
//			for(int i = 1; i <= 9; i++){
//				System.out.println(dan + " * " + i + " = " + dan * i );
//			}
//		}
		
		/*
		 * <<do-while문>>
		 * -do{}while(조건식);
		 * -최소한 한번의 수행을 보장한다.
		 */
		//숫자맞추기 게임을 만들어보자!
		
//		int answer = (int)(Math.random() * 100) + 1;//1~100사이의 랜덤수를 발생시킨다
//		int input = 0;
//		Scanner s = new Scanner(System.in);
//		do{
//			System.out.println("1~100사이의 수를 입력해주세요.>");
//			input = Integer.parseInt(s.nextLine());
//			
//			if(answer < input){
//				System.out.println(input + "보다 작습니다.");
//			}else if(input < answer){
//				System.out.println(input + "보다 큽니다.");
//			}else{
//				System.out.println("정답입니다!");
//			}
//		}while(input != answer);
		//이름붙은 반목문
		
		outer : for(int i = 2; i <= 9; i++){
			for(int j = 1; j <= 9; j++){
				if(j == 5 ){
//					break;//가장 가까운 반복문 하나를 빠져나간다.
//					break outer;//outer라는 이름의 반복문을 빠져나간다.
//					continue;//가장 가까운 반복문의 현재 반복 회차를 빠져나간다./5가 돌때 빠져나와서 다시 6으로
					continue outer;//outer라는 이름의 현재 반복회차를 빠져나간다
				}
				System.out.println(i + " * " + j + " = " + i * j);
			}
			System.out.println();
		}
	}

}
