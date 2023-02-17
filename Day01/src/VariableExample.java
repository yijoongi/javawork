
public class VariableExample {

	public static void main(String[] args) {		// TODO Auto-generated method stub
		/*
		 # 변수(variable)
	1. 변수는 데이터가 저장되는 공간에 이름을 붙여놓은 것
	2. 변수는 생성시 변수에 저장되는 데이터의 크기와 모양에 
	따라 적당한 데이터 타입을 선언해야 한다.
	ex) int : 4바이트의 정수 , string : 문자열(문장)
	3. 변수는 동일한 이름으로 중복 선언할 수 없다.
	4.변수 내부의 값은 언제든지 변경이 가능하다. 
	
	 
	 
	
		 */
		//변수의 선언 : [자료형(데이터 타입)] [변수명];
		int age;
		
		//변수의 초기화 : [변수명] = [값];
		age =40; 
		System.out.println(age);
		
		//변수는 선언과 초기화를 동시에 가능
		//(처음 만들때 한번만 가능)
		int score = 90;
		//int score = 95; 변수의 중복선언은 허용하지 않음
		score = 95;
	//변수 하나당 값을 하나밖에 대입할 수 없다.(기존값은 사라지고새로운 값이 할당)
		System.out.println(score);
		//변수에는 다른 변수의 값도 저장이 가능하다
		int myscore =score;
		//-> myscore (좌측)은 공간이므로 myscore라는 공간에 score 값을 넣겠다.
		System.out.println(myscore);
		
		
		
		
		// 변수의 자료형에 맞지 않는 데이터는 저장이 불가능하다.
	//  int count = "한번" (int로 선언한 변수에 텍스트인 한번은 들어갈 수 없다)
	//변수는 자료형(데이터 타입)이 달라도 이름이 동일하다면 중복 선언할 수 없다.

	//int name = 1004;(X)
	//선언 및 초기화하지 않은 변수는 사용이 불가능하다.
	//int result = myscore + num;(X)
	
	
		
		
	}

}
