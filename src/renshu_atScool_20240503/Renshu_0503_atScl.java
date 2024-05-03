package renshu_atScool_20240503;

public class Renshu_0503_atScl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("helloworld!!");
		System.out.println("helloworld!!");
		System.out.println("helloworld!!");
		
		System.out.print("helloworld!!");
		System.out.print("helloworld!!");
		System.out.print("helloworld!!");

		
		int numInt;
		numInt = 10; // 윗줄에서 변수를 선언을 한 후에 여기서 초깃값을 설정
		
		// int num = 10; // 이런 식으로 코딩하면 변수의 선언과 동시에 초기값도 설정하는 것.
		
		double numDouble; // 실수 변수 선언
		numDouble = 3.14; // 초기값 설정
		
		String str; // 문자열 변수 선언
		str = "Korea"; // 초기값 설정
		
		boolean logi; // 논리항 변수 선언(true, flase 만 저장 가능)
		logi = true; // 초기값 설정
		
		char ch = 'A'; // 문자 변수 선언(1글자 저장) -> ''(반드시 작윽 따음표)로 저장해야 함.
		
		char chr2 = 65; //이렇게 해도 에러가 안남.
		//정수를char 변수에 저장하면 해당 정수가 가리키는 아스키 코드 문자가 저장되기 때문에 숫자 65가 출력되는 것이 아니라 문자 A가 출력되는 것.
		System.out.println(chr2);
		
		// 형변환
		// 파이썬 : (int)numDouble -> 정수로 형 변환
		// dint = (int)numDouble; 이렇게 하면 dint가 선언 안되어 있어서 에러발생. 파이선은 이대로도 에러가 발생하지 앟음.
		int dint = (int)numDouble; //따라서 선언과 동시에 초기값 부여애야 에러 없음.
		System.out.println(dint);
		
		double idou = (double)numInt;
		System.out.println(idou);
		
		// 위에서와 같은 것을 임시 형변환이라고 함. 화면상에서만 형변환된 것?
		
		String strInt = "1000";
		
		// 파이썬에서는 : (int)strInt ->하면 문자열 숫자가 실제 정수로 형변환 됨. 매우 쉬움.
		// 그런데 자바에서는 파이썬 처럼 쓰면 에러가 발생
		// 에러가 나면 마우스를 올려보면 풍선도움말로 에러 설명을 해줌.
		// int strSample = (int)strInt;
		// java에서는 임시적 형변환으로 문자열을 숫자(정수, 실수)로 변환이 불가능함. 그래서 파이썬이 쉬운 언어임을 알 수 있음.
		// 자바에서는 wrapper class를 사용하여 형변환이 가능함. 대상을 변환하고자 하는 것으로 감싸 주는 것. 마치 포장하는 것처럼
		// wrapper class는 클래스이니까 모두 대문자로 시작해야 함.
		
		//Integer  // 첫글자 I를 쓰고 컨트롤스페이스 하면 맨 위에 래퍼클래스가 뜬다. 파이썬에서는 내장이 되어 있어도 import를 해주어야 하는데
		// 원래 자바에서도 import java.lang으로 불러와야 하지만, java.lang은 기본중의 기본, 기본으로 깔고 가야 하는 거기 때문에 생략이 가능한 것. 
		//즉 무조건 필요한 라이브러리라서 따라 import 없이 바로 불러올 수 있음. 마치 식당에서 음식주문하면 밥은 필수적으로 자동으로 나오는 것처럼.
		int strSample = Integer.parseInt(strInt);
		System.out.println(strSample);
		
		String strDouble = "3.14";
		double strSample2 = Double.parseDouble(strDouble); // 문자열 "3.14" -> tlftn 3.14로 변환
		System.out.println(strSample2);
		
		// 정수(실수)를 문자열로 변환
		// 파이썬에서는 : (str)1000 -> 문자열로 취급
		
		int num1= 157; // 157을 문자열로 바꾸고 싶을 때 파이썬의 방법으로는 안됨.
		String numStr1 = String.valueOf(num1); // 이렇게 해야 문자열이 정수로 변환됨. 그런다음 변수에 저장.
		System.out.println(numStr1);
		System.out.println("문자열로 변환된 값 :" + numStr1); // 자바에는 f 스트링이 없으니 문자열과 + 를 이용해서 표시할 수 있음.
		
		// 이상이 파이썬과 다른 자바의 기본 문법.
		
		System.out.printf("정수값 출력 : %d", num1); // 예전에 c언어는 이렇게 코딩했다고. 결과는 같음.print에 f가 덧붙는 데 주의
		
		
		
		
		
		
		
		
	}

}
