package basic;

public class PrintExample {

	public static void main(String[] args) {
		
		
		//자바의 표준 출력 형식은 크게 3가지 입니다. 
		// - 개행(줄바꿈)을 포함하지 않는 print()
		//- 자동으로 개행을 포함해 주는 println()
		
		
		System.out.print("안녕하세요");
		System.out.print("안녕하세요");
		System.out.println("안녕히 가세요");
		System.out.println("안녕히 가세요");
	// -형식 지정 표준 출력 함수 :printf()
		//- 서식 문자를 이용해서 문자열을 완성한 후
		//서식 문자에 들어갈 값을 지정해서 출력하는 방식.
	      int month =12;
	       int day = 25;
	   String anni = "크리스마스";
	   
	// -#포맷팅 서식 문자 종류
	//%d : 부호가 있는 정수 데이터 
	//%f :  실수 데이터
	//%s : 문자열 (String)
	   
	  System.out.println(month + "월 "+ day + "일은 " + anni +"입니다.");
	  System.out.printf("%d월 %d일은 %s입니다.\n",month, day, anni);
	
	
	
	
	//12월 25일은 크리스마스 입니다.
	   
	
	
	double rate = 64.126;
	//합격률은 64%입니다.
	System.out.printf("합격률은 %.0f%%입니다.",rate);
	
	
	
	//#탈출코드(escape code) (반드시 문자열 내에서 특정 명령을 내릴때 사용, 따라서 문자열 내에서만 사용가능하다)
	
	// \n :줄 개행 명령
	//\t : 가로공백 (스페이스 4칸)
	//실수를 표현하는 서식문자 %f
	//%.[자리수를 지정하는 숫자]f - > 원하는 자릿수까지 표현
	
	
	
	}
}
