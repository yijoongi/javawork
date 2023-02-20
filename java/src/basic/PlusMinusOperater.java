package basic;

public class PlusMinusOperater {

	public static void main(String[] args) {
		
		int i = 1;
//(증감연산자 ; 변수의 값을 단순히 올리거나 내릴때사용)		
		//i를 하나 올리기위해서는 i++;(단독으로 쓰일때는 차이가 없음)
		i++;
		i++;
		++i;
		--i;
		
		System.out.println(i); // 3번올리고 1번 내림
		
		int u = 1;
		int j =u++;//(뒤에 붙었으므로 후위연산 (선 연산 후 증감)
		int k =u--;
		System.out.println("u의 값: " + u);
		System.out.println("j의 값: " + j);
		System.out.println("k의 값: " + k);
		
		System.out.println("-------------------------");
		
		int x = 1;
		int y = ++x;//(앞에붙었으므로 전위연산(선 증감 후 연산 )(먼저 올리고 대입이 진행된다)
		int z = --x;
		
		System.out.println("x의값 :" + x);
		System.out.println("y의값 :" + y);
		System.out.println("z의값 :" + z);
		
		
		int a = 3;
		int b = ++a +5*3;
		System.out.println(b);
		
				
		
		
		
		
		
	}

}
