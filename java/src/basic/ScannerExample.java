package basic;

import java.util.Scanner;
public class ScannerExample {//1.Scanner api 로딩(제공되는 Scanner 정보를 현재 클래스로 가져옴
	
	
	public static void main(String[] args) {
	
// 2.스캐너 객체를 생성. 
		
		Scanner sc = new Scanner(System.in);
		
	//3.스캐너의 함수들을 이용하여 데이터를 입력받을 수 있습니다.
		//=next() : 공백이 없는 문자열을 입력받습니다.
		//=nextLine(): 공백을 포함한 문자를 입력받습니다.
		//=next +기본타입이름(): 해당 타입에 맞는 데이터를 입력받습니다.
		//ex) nextInt():정수 데이터를 입력받습니다.
		//    nextDouble() : 실수 데이터를 입력받습니다.
		System.out.print("이름을 입력하세요: ");
		
		String name = sc.nextLine();
		System.out.println(name);
		System.out.print("나이를 입력하세요: ");
		int age = sc.nextInt();
		System.out.println(age);
		System.out.println("제이름은 "+ name + "이고, 나이는"+ age+"입니다.");
		System.out.printf("제이름은 %s이고, 나이는 %d세입니다.",name, age);
		
		//4.scanner 객체를 반납
		//객체를 반납 - > Scanner를 메모리에서 해제
		sc.close();
		
		
		
	}
	
}
