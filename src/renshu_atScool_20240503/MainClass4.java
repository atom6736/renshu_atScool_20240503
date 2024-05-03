package renshu_atScool_20240503;

public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 10;
		int y = 20;
		
		int result1 = ++x; // x = x + 1 이것이 ++x 같은 것. 너무 많이 쓰니 ++x로 줄여 쓰는 것.
		int result2 = y++; // y = y + 1
		
		System.out.println(result1); 
		System.out.println(x);
		System.out.println(result2); // 20 증감연사자의 위치가 변수의 앞에 있느냐 뒤에 있느냐에 따라 달라짐. 
		System.out.println(y); // 21출력. 변수가 앞에 있든 뒤에 있든 본인의 값은 1씩 증가하는데, 
		// 그런데 다른 연산자와 같이 쓸 때가 문제됨.
		
		int a = 1;
		int b =1;
		int result3 = ++a + 10;
		System.out.println(result3); //11로 예상할텐데 12가 찍힌다. 
		System.out.println(a);
		
		int result4 = b++ + 10;
		System.out.println(result4); //11이 찍힘.
		System.out.println(b); //2가 찍힘.
		
		
		int sum = 0;
		int i = 10;
		
		sum = sum + 1;
		
		sum += i;  // sum = sum + i;
		
		sum = sum * i;
		
		sum *= i; // sum = sum * i;
		
		
		// 교재 연습문제 132쪽?
		
		int x1 = 10;
		int y1 = 5;
		
		System.out.println((x1>7) && (y1<=5));
		System.out.println((x1%3==2) || (y1%2 !=1));
		
		
		
				

	}

}
