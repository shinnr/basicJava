package c_statement;

import java.util.Scanner;

public class SimLiTest {

	public static void main(String[] args) {
		System.out.println("나의 연애 유형은?");
		System.out.println("말해 Yes or No!");
		
		Scanner s= new Scanner(System.in);
		String ans = "";
		String type="";
		
		System.out.println("나는 금사빠다. (y/n)");
		ans=s.nextLine();
		if(ans.equals("y"))
		{
			System.out.println("연애할 때 끌려다니는 타입이다. (y/n)");
			ans=s.nextLine();
			if(ans.equals("y"))
			{
				System.out.println("감정표현에 솔직한 편이다. (y/n)");
				ans=s.nextLine();
				if(ans.equals("y")){
					System.out.println("이성친구는 존재할 수 없다. (y/n)");
					ans=s.nextLine();
					if(ans.equals("y")){
						System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다. (y/n)");
						ans=s.nextLine();
						if(ans.equals("y"))
						{
							type = "D";
						}
						else
						{
							type = "C";
						}
					}
					else
					{
						type = "B";
					}
				}
				else{
					System.out.println("활동적인 데이트가 좋다. (y/n)");
					ans=s.nextLine();
					if(ans.equals("y")){
						System.out.println("이성친구는 존재할 수 없다.");
						ans=s.nextLine();
						if(ans.equals("y")){
							System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.");
							ans=s.nextLine();
							if(ans.equals("y")){
								type = "D";
							}
							else{
								type = "C";
							}
						}
						else{
							type = "B";
						}
					}
					else{
						System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.");
						ans=s.nextLine();
						if(ans.equals("y")){
							type = "D";
						}
						else{
							type = "C";
						}
					}
				}
			}
			else{
				System.out.println("데이트 코스는 미리 짜는 게 편하다. (y/n)");
				ans=s.nextLine();
				if(ans.equals("y")){
					System.out.println("활동적인 데이트가 좋다. (y/n)");
					ans=s.nextLine();
					if(ans.equals("y")){
						System.out.println("이성친구는 존재할 수 없다. (y/n)");
						ans=s.nextLine();
						if(ans.equals("y")){
							System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다. (y/n)");
							ans=s.nextLine();
							if(ans.equals("y"))
							{
								type = "D";
							}
							else{
								type = "C";
							}
						}
						else{
							type = "B";
						}
					}
					else{
						System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다. (y/n)");
						ans=s.nextLine();
						if(ans.equals("y")){
							type = "D";
						}
						else{
							type = "C";
						}
					}
				}
				else{
					System.out.println("감정표현에 솔직한 편이다. (y/n)");
					ans=s.nextLine();
				}
			}
		}
		else
		{
			System.out.println("감정기복이 크지 않다. (y/n)");
			ans=s.nextLine();
			if(ans.equals("y"))
			{
				System.out.println("연락이 없어도 믿고 기다리는 편이다. (y/n)");
				ans=s.nextLine();
				if(ans.equals("y"))
				{
					type = "A";
				}
				else{
					System.out.println("이성친구는 존재할 수 없다. (y/n)");
					ans=s.nextLine();
					if(ans.equals("y"))
					{
						System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다. (y/n)");
						ans=s.nextLine();
						if(ans.equals("y"))
						{
							type = "D";
						}
						else
						{
							type = "C";
						}
					}
					else
					{
						type = "B";
					}
				}
			}
			else{
				System.out.println("감정 표현에 솔직한 편이다.");
				ans=s.nextLine();
				if(ans.equals("y")){
					System.out.println("이성친구는 존재할 수 없다.");
					ans=s.nextLine();
					if(ans.equals("y")){
						System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.");
						ans=s.nextLine();
						if(ans.equals("y")){
							type = "D";
						}
						else{
							type = "C";
						}
					}
					else{
						type = "B";
					}
				}
				else{
					System.out.println("활동적인 데이트가 좋다.");
					ans=s.nextLine();
					if(ans.equals("y")){
						System.out.println("이성친구는 존재할 수 없다.");
						ans=s.nextLine();
						if(ans.equals("y")){
							System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.");
							ans=s.nextLine();
							if(ans.equals("y")){
								type = "D";
							}
							else{
								type = "C";
							}
						}
						else{
							type = "B";
						}
					}
					else{
						System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.");
						ans=s.nextLine();
						if(ans.equals("y")){
							type = "D";
						}
						else{
							type = "C";
						}
					}
				}
			}
		}
		System.out.println("-------결과보기-------");
		System.out.println("-----나의 연애 유형------");
		switch(type){
		case "A" :
			System.out.println("A : 서로에 대한 신뢰감이 깊고, 존중해주는 어른스러운 연애를 하는 타입!");
			break;
		case "B" :
			System.out.println("B : 구속을 하는 것도, 받는 것도 싫은 자유로운 연애를 하는 타입!");
			break;
		case "C" :
			System.out.println("C : 이것은 의리인가, 사랑인가...친구같이 편안한 연애를 하는 타입!");
			break;
		case "D" :
			System.out.println("D : 무조건 잘해주고, 무조건 맞춰주는 다 퍼주는 연애를 하는 타입!");
			break;
		}
	}

}
