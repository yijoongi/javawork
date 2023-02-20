package basic;

public class CastingExample2 {

	public static void main(String[] args) {
		
		int i = 72;
		char c = (char) i; //을 컴파일 하기위해서는 
		//i의 타입을 강제로 낮춰야 한다. (다운캐스팅)
		
		//char c =(char) i;
		
		double d = 4.9876;
		int j = (int) d;
	System.out.println(j);
	
	
	int k = 1000;
	byte b = (byte) k;
	System.out.println(b); //1000이 -24로 변환되므로 값의 손실이 
	//일어나게된다{자동형변환을 진행해주지 않음. (다운캐스팅의 폐해)}
	//오버플로우, 언더플로우의 가능성이 존재한다.
	
	
	
		
		
		
	}

}
