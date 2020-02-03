package b_operator;

public class Etc {

	public static void main(String[] args) {
	/*
	 * <<비트연산자>>
	 * - |(OR)	  :피연산자 중 한족이라도 값이 1이면 1을, 그외는 0을 결과로 얻는다.
	 * - &(AND)   :피연산자 양쪽이 모두 1이어야만 1을, 그외는 0을 결과로 얻는다.
	 * - ^(XOR)   :피연산자의 값이 서로 다를 때만 1을, 같은때는 0을 결과로 얻는다
	 * - ~(비트전환) :피연산자를 0은 1로, 1은 0으로 바꾼다
	 * - <<(쉬프트)  :피연산자의 각 자를 왼쪽으로 이동시킨다. 빈칸은 0으로 채운다.
	 * - >>(쉬프트)  :피연산자의 각 자를 오른쪽으로 이동시킨다. 빈칸은 앞자리와 동일한 값으로 채운다.
	 * 
	 * <<기타연산자>>
	 * - .(참조연산자)   :특정범위 내에 속해 있는 멤버를 지칭할 대 사용한다.
	 * - (type)       :형변환(casting)
	 * - ?(삼항연산자)   : 조건식 ? 조건식이 참일 경우 수행할 문장 : 조건식이 거짓일 경우 수행할 ㅁ문장
	 * - instanceof   :참조형 타입 확인
	 */
		
	/*
	 * -10진수 -> 2진수 : 10진수 값을 1이 될 때까지 2로 나눈다.
	 * 10
	 * 5...0
	 * 2...1
	 * 1...0
	 * ->1010==10
	 * 
	 * 15
	 * 7...1
	 * 3...1
	 * 1...1
	 * ->1111
	 * 
	 * -2진수->10진수 : 각 자리에 1, 2, 4, 8, 16, 32...를 곱한값을 더한다.
	 * 1 0 1 0
	 * 8 4 2 1
	 * 8+0+2+0->10
	 * 
	 * 1 1 1 1
	 * 8 4 2 1->15
	 *
	 * 
	 */
		
	//00001010 : 10
	//00001111 : 15
		
	//| : 00001111
	System.out.println(10 | 15);
	//& : 00001010
	System.out.println(10 & 15);
	//^ : 00000101 : 5
	System.out.println(10 ^ 15);
	//~ :11110101
	System.out.println(~10);
	//<< : 00010100
	System.out.println(10 << 1);
	//>> : 00000101
	System.out.println(10 >> 1);
	
	int x = 10;
	int y = 20;
	int result = x < y ? x : y;
	//int result =true ? x : y;
	//int result = x;
	System.out.println(result);
	
	//점수가 60점 이상이면 합격 미만이면 불합격
	int score = 50;
	String res = 60 <= score ? "합격" : "불합격";
	System.out.println(score + "점은 " + res + "입니다.");
	
	//주민등록번호 뒷자리의 첫번째 숫자가 1이면 남자 2면 여자
	int regNo = 2;//주민등록번호 첫자리
	String gender = regNo == 1 ? "남자" : "여자";
	System.out.println("당신의 성별은 " + gender + "입니다.");
	
	gender = regNo == 1 ? "남자" : (regNo == 2 ? "여자" : "확인불가");
	System.out.println("당신의 성별은 " + gender + "입니다.");

	//두개의 변수에 저장된 수 중에 큰 숫자를 출력해주세요
	int num1 = 10;
	int num2 = 5;
	int result2 = num1 > num2 ? num1 : num2;
	System.out.println(result2);
	
	//변수에 저장된 수의 절대값을 출력해주세요.
	int a = -5;
	int b = a < 0 ? -(a) : a;
	System.out.println("절대값은 " + b + "입니다.");
	
	//변수에 저장된 주민등록번호 뒷자리의 첫번째 숫자가 1이나 3이면 남자를
	//2나 4면 여자를 출력해주세요
	//그외의 숫자는 확인불가를 출력해주세요.
	
	int number1= 5;
	String genCheck = number1 == 1 || number1 == 3 ? "남자" : (number1 == 2 || number1 == 4 ? "여자" : "확인불가");
	System.out.println("당신의 성별은 " + genCheck + "입니다.");
	 
	
	}

}
