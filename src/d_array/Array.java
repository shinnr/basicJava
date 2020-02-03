package d_array;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		/*
		 * << 배열 >>--여러개의 값을 묶어서 사용, 타입이 같아야 함!
		 * - int[] number = new int[5];-배열안에 int 다섯개를 저장하겠다
		 * - int[] number = new int[]{10, 20, 30, 40, 50};
		 * - int[] number = {10, 20, 30, 40, 50};
		 * --특징 : 길이가 정해지면 바꿀 수 없삼
		 * -
		 */
		
		//배열은 참조형 타입입니다. //참조형 : 값이 저장되어 있는 주소를 저장
		int[] array; //배열의 주소를 저장할 공간이 만들어집니다.
		array = new int[5];//배열이 생성되고 그 주소가 저장된다.
		//new : 새로운 저장공간 생성 및 주소 반환
		//int[5] : int를 저장할 수 있는 5개의 공간
		//배열 초기화시 기본값이 저장됨 //ex:int 타입의 기본값인 0이 다섯개 들어감
		
		System.out.println(array);//배열의 주소 출력
		
		System.out.println(array[0]);//실제값에 접근하기 위해서는 index를 지정해주어야 함
		//index에는 int만 사용할 수 있다.(리터럴, 변수, 상수, 연산 등)
		//배열의 최대크기는 int의 최댓값(약20억)이다.
		
		String arrayStr = Arrays.toString(array);//배열의 모든 인덱스에 저장된 값을 문자열로 반환
		System.out.println(arrayStr);
		
		int[] iArray1 = new int[]{1, 2, 3};//값의 개수로 배열의 길이가 정해진다.
		int[] iArray2 = {1, 2, 3}; //선언과 초기화를 동시에 해야함.
		int[] iArray3;
//      iArray3 = {1,2,3};//컴파일 에러 발생
		
		array[0] = 10;//인덱스는 0부터 시작
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;
		array[4] = 50;
		//array[5] = 50; ArrayIndexOutOfBoundsException 발생 //정해진 길이 벗어남
		
		//정수를 저장할 수 있는 길이가 10인 배열을 생성및 초기화 해주세요.
		int[] exArray = new int[10];
		
		//모든 인덱스에 있는 값을 변경해주세요
//		exArray[0] = 10;
//		exArray[1] = 20;
//		exArray[2] = 30;
//		exArray[3] = 40;
//		exArray[4] = 50;
//		exArray[5] = 60;
//		exArray[6] = 70;
//		exArray[7] = 80;
//		exArray[8] = 90;
//		exArray[9] = 100;
		
		//index는 1씩 증가하는 규칙이 있어 for문과 함께 사용하기 좋다
		for(int n = 0; n<exArray.length; n++){
			exArray[n] = n;
			
		}
		System.out.println(Arrays.toString(exArray));
		//모든 인덱스에 있는 값을 더해주세요
//		int sum =0;
//		sum = exArray[0] + exArray[1] + exArray[2] + exArray[3] + exArray[4] + exArray[5]+ exArray[6]+ exArray[7]+ exArray[8] + exArray[9];
//		
//		System.out.println(sum);
		
		int sum = 0;
		for(int i = 0; i<10; i++){
			sum += exArray[i];
		}
		System.out.println(sum);
		
		//배열에 숫자를 저장하고 합계와 평균을 구해보자.
		int[] numbers = new int[10];
		
		for(int i = 0 ; i <numbers.length; i++){
			numbers[i] = (int)(Math.random()*100)+1;
		}
		System.out.println(Arrays.toString(numbers));
		
		sum = 0; //합계
		double avg = 0; //평균
		for(int i = 0; i < numbers.length; i++){
			sum += numbers[i];
		}
		avg = (double)sum/numbers.length;
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		
		//향상된 for문
		for(int number : numbers){//배열에 있는 값을 차례대로 변수에 넣는다
			System.out.println(number);
		}
		
		for(int number : numbers){
			number = 0;//numbers의 값은 변경되지 않는다.
			System.out.println(number);
		}
		System.out.println(Arrays.toString(numbers));
		
		//배열에 저장된 숫자들 중 최솟값과 최대값을 찾아주세요.
		int min = numbers[0];
		int max = numbers[0];
		
		for(int i = 0; i < numbers.length; i++){
			if(min>numbers[i]){
				min = numbers[i];
			}
			if(max<numbers[i]){
				max = numbers[i];
			}
		}
		System.out.println("min :" + min + " max :" + max);
		
		int[] shuffle = new int[30];
		for(int i = 0; i < shuffle.length; i++){
			shuffle[i] = i + 1;
		}
		System.out.println(Arrays.toString(shuffle));
//		
//		int num = 0;
//		for(int i = 0; i < shuffle.length; i++){
//			num = (int)(Math.random()*shuffle.length);
//			shuffle[num] = i;
//		}
//		System.out.println(Arrays.toString(shuffle));
		//
		for(int i =0; i<shuffle.length * 10; i++){
			int random = (int)(Math.random()*shuffle.length);
			int temp = shuffle[0];
			shuffle[0]= shuffle[random];
			shuffle[random]=temp;
		}
		
		System.out.println(Arrays.toString(shuffle));
		
		//1 ~ 10사이의 난수를 500번 생성하고, 각 숫자가 생성된 횟수를 출력해주세요.
		int nums[] = new int[10];
		
		for(int i = 0; i < 500; i++){
			int ran = (int)(Math.random()*10)+1;
		
			for(int j = 1; j <=10; j++){
				if( j == ran){
					nums[j-1]++;
				}
			}

		}
		System.out.println(Arrays.toString(nums));
		for(int n = 1; n  <= 10; n++){
			System.out.println(n + " : " + nums[n-1]);
		}
		//위 문제의 최솟값, 최대값, 반복횟수를 입력받아 각 숫자가 생성된 횟수를 출력해주세요
		Scanner sc = new Scanner(System.in);
		
		System.out.println("최솟값을 입력해주세요.");
		int minn = Integer.parseInt(sc.next());
		System.out.println("최대값을 입력해주세요.");
		int maxx = Integer.parseInt(sc.next());
		System.out.println("반복횟수를 입력해주세요.");
		int input = Integer.parseInt(sc.next());
		
		int nums2[] = new int[input];
		
		for(int i = 0; i < input; i++){
			int ran2 = (int)(Math.random()*maxx)+1;
			while(minn>ran2){
				ran2 = (int)(Math.random()*maxx)+1;
			}
		
			for(int j = 1; j <= maxx; j++){
				if( j == ran2){
					nums2[j-1]++;
				}
			}

		}
		System.out.println(Arrays.toString(nums2));
		for(int n = 1; n  <= input; n++){
			System.out.println(n + " : " + nums2[n-1]);
		}
		
		
		
	}

}
