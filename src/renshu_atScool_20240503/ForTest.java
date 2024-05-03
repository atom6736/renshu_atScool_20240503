package renshu_atScool_20240503;

public class ForTest {

	public static void main(String[] args) {
		// 1~10까지 출력하는 for 문을 작성해보자.
		
		// 파이썬으로 하면: for i in range(1,11): 하고 print(i) 하면 됨.
		// 그런데 자바에서는 매우 다름.
		
		for(int i=1;i<=10;i++) {  //초기값, 조건식, 증가식 줄여서 초;조;증이 들어간다.
			// 초기값은 i를 의미. 파이썬에서 i는 초기값이 1. 1을 시작으로 변해갈 것.
			// 파이썬은 변수선언시 타입을 안 써도 되니 그냥i라고 썼지만 자바는 타입을 선언해주어야 함. 
			// 안에서 선언하거나 아니면 밖에서 선언해 주어야 하는데, 줄이 하나 더생기는 것을 싫어해서 안에다 써중.
			//자바에는 range가 없어 증가식을 이용하기 위해 아이뿔뿔을 씀.
			System.out.println(i);
			
		}
		for(int i=100;i>=1;i--) { // 초기값, 조건식, 증감식
			System.out.println(i);
		}

		// 1부터 1000 사이의 수 중 짝수만 출력하는 for문을 작성하시오.
		for(int i=0;i<=1000;i=i+2) { 
			System.out.println(i);
		}
		int sum = 0;
		// 1~100까지의 합을 출력하는 for문을 작성하시오. 5050.
		for(int i=1;i<=100;i++) {
			sum = sum + i;
		}
		System.out.println(sum);
		
		
	}

}
