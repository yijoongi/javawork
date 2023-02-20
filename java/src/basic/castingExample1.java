package basic;

public class castingExample1 {

	public static void main(String[] args) {
		byte b = 10;
		int i = b;
		System.out.println(i);
		//int가 byte보다 큰 타입이기때문에 타입의 byte의 업캐스팅이 일어난다
		//자동형변환이라고 한다.byte가 표현하는것을 int가 충분히 포함할 수 
		//있기때문에 형변환 가능
		
		char c ='A';
		int j = c;
		System.out.println(j);
		System.out.println("A의 문자 번호:"+j);
		
		int k = 500;
		double d = k;
		System.out.println(d);
		

	}

}
