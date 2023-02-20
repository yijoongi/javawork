package basic;

public class LogicalOperator {

	public static void main(String[] args) {
	
	//비교(관계) 연산자 (< , <=, >, >= ,==, !=)
		//== : 같다
	    //!= : 같지않다
	   //결과값으로 항상 논리값을 도출합니다.
	int x = 10 ,y =20; // x는 10이고, y는 20이다 
	System.out.println(x==y);
	
	
	//논리 연산자 (&,&&,| ,||) : 좌항과 우항의 논리값을 연산하여 하나의 논리값을 도출한다
	//1. &,&& : 양쪽항의 논리값이 모두 true일 경우에만 true 가도출된다.
	// |,|| : 양쪽 항의 논리값 중 한쪽만 true여도 true를 도출한다.
	
	
    System.out.println(x> 10 && (y / 0 ==10));
    System.out.println(x> 10 || y <30);
    // &&, ||  : 단축 평가 연산 -좌항의 연산결과가 전체 연산결과에 영향을 미칠경우
    //우항의 연산을 진행하지않음.
	    
    
      	//논리 반전 연산자 ( ! : 단항)
    	// 단순히 논리값을 반전시킬 때 사용
    	// true  - > false, false ->true
    
    int z = 10;
    System.out.println(!(z==10));
    
    
    
    
    
	
		
		
	}

}
