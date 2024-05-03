package renshu_atScool_20240503;

public class MainClass5_scl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int score = 85;
		
		if (score >= 90) {
			System.out.println("수!");
		//elif 조건:
			
		} else if (score >=80) {
			System.out.println("우!");
		} else if (score >=80) {
			System.out.println("미!");
		} else if (score >=80) {
			System.out.println("양!");
			}
		
		int favor = 3;
		
		switch(favor) {
			case 1:
				System.out.println("안녕!");
			case 2:
				System.out.println("감사!");
			case 3:
				System.out.println("hi!");
			default:
				System.out.println("잘가요!");
		}
		

		int favor1 = 1;
		
		switch(favor1) {
			case 1:
				System.out.println("안녕!");
			case 2:
				System.out.println("감사!");
			case 3:
				System.out.println("hi!");
			default:
				System.out.println("잘가요!");
		}
		
		int favor2 = 1;
		
		switch(favor2) {
			case 1:
				System.out.println("안녕!");
				break;
			case 2:
				System.out.println("감사!");
			case 3:
				System.out.println("hi!");
			default: // default가 else인 것. 앞의 것이 모두 아니면 이것이 직히는 것.
				System.out.println("잘가요!");
		}
		
		// 변수의 값이 분리되어 있는 경우(exL 1,2,3 중의 1개, A,B,C 중에 하나의 값만 들어오는 경우에는 
		// switch 문이 if문 보다 간결하게 코드 작성 가능
//		
//	String favor3 = 'A';
//		
//		switch(favor3) {
//			case A:
//				System.out.println("안녕!");
//				break;
//			case B:
//				System.out.println("감사!");
//			case C:
//				System.out.println("hi!");
//			default: // default가 else인 것. 앞의 것이 모두 아니면 이것이 직히는 것.
//				System.out.println("잘가요!");
//		}
//	
	
	}

}
