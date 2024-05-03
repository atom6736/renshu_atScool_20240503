package renshu_atScool_20240503;

import java.util.Scanner;

public class MainClass2_atScl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner // 이것은 java.utl 패키지지만 import를 해야 함. 그래도 내장이라 자동완성은 됨.
		//java.lang소속은 import안해도 되지만.
		
		// 아래의 코딩이 파이썬의 input 문과 동일한 기능.
		Scanner scanner; // 클래스로 만든 객체 변소, 객체는 그냥 10으로 만들 수 없고. 객체를 초기화하려면 앞에 new라는 연산자를 앞에 써주어야 함.
		scanner = new Scanner(System.in); 
		// 보통은 한 줄로 많이 써줌. Scanner scanner = new Scanner(System.in); 
		// 이렇게 하면 시스템의 입력장치로부터 유저가 입력한 내용을 입력받을 수 있도록 초기화되는 것.
		
		// scanner. 점하면 메서드들이 보여짐.
		System.out.println("당신의 이름을 입력하세요:");
		
		String inputData = scanner.nextLine();  // next line 이라는 것. 엔터키를 치기 전까지 입력된 문자열을 가져오는 것.
		// 문자로 가져오니 무조건 문자열 변수에 저장해야 함.
		
		System.out.println(inputData); // 실행시키면 아무것도 안 썼으니까 아무것도 안 나온다고. 콘솔창에 찍어야 함.
		

	}

}
