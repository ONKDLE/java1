package Java_Test;

import java.util.Scanner;

public class one {
	// 클래스 변수 / 종단 변수 : 상수 정의.
	static final double PI = 3.14159;
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("반지름을 입력 하세요 : ");
		int radius = stdIn.nextInt();
		
		System.out.println("원의 반지림은 : " + radius );
		
		// 클래스명을 통해 클래스 변수값 이용.
		double area + radius * radius*SimpleCircle.PI;
		System.out.println("원의 넓이는 : " + area);
	}

}
