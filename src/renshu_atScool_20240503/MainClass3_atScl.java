package renshu_atScool_20240503;

import java.util.concurrent.locks.Condition;

public class MainClass3_atScl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		// java의 if문 형식.
//		if (10>5) {
//			System.out.println("10은 5보다 크다");
//		} else {
//			System.out.println("10은 5보다 크다");
//		}
		
		int num = 100;
		if (num == 100) { // 숫자값을 비교할 때는 부등호를 사용(==)
			System.out.println("축하합니다.! 100점입니다!");
					
				}
		
		// 문제는 문자열을 비교할 떄임.
		String str1 = "KOREA";  //당신은 한국인이다라를 조건문으로 하려면?
		String str2 = "KOREA";
		if (str1.equals(str2)) {  // ==등호로 비교하면 오류가 날 수 있기 때문에 
			//문자열을 비교할 때는 점equals로 비교하는 것이 필요하다.(중요) 그래야 정확한 비교결과를 얻을 수 있다.
			// 나중에 백엔드에서는 입력된 문자열을 비교하는 경우가 많이 있기 때문에, 문자열 비교는 등호를 절대 쓰지 말고 equals를 사용하라.
			// 파이썬에서는 등호로 해도 괜찮지만.
			
			System.out.println("당신은 한국인입니다!");
		}

	
	}

}
