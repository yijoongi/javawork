package basic;

public class CastingExample3 {

	public static void main(String[] args) {
		
		
		//char c ='B' ;
		//int i = 2 ;
		
		//타입이 서로 다른 연산에서는 데이터 타입이 큰 쪽으로 맞춰져서 자동으로 형변환이 진행된 후에 연산
		 	//c+i //char 와 int의 덧셈연산이다. 
		 //int intResult = c+ i;
		 //char charResult = c + i;
		 
		 
		 int k = 10;
		 double d = (double) k / 4;
		 System.out.println(d);
		 
		 
		 byte b1 = 100;
		 byte b2 = 70;
			System.out.println(b1+b2);	 
			//int 보다 작은값의 연산은 데이터손상을 방지하기 위해 자동으로 int타입으로 바꿔서 변환해준다
		 

	}

}
