package ifswitchfordowhile;

/*
  ①변수 선언;
 do {
 	②실행문
 	③증감식
 } while(④조건식)*/

public class dowhile_1 {
	public static void main(String[] args) {
		
		int k =10; //  ① 변수 선언 int k는 10 이라고 집어 넣어 줬다
		do { 
			System.out.println("do-while OK"); //for문이나 while문에서 봤던 조건문을 실행 안하고 바로 ②실행문으로 실행한다
			k++; // ③증감식 k를 1 증가시키고 그럼 11이 된다 나서
			}while(k<10); //④조건식 k가 10보다 작으냐? 작다면 어떻게 하라구? 다시  ②실행문 으로 가겠지만 지금 값이 증가 되어11이기때문에 작지않다
		// 그래서 빠져나와서 결과값이 do-while OK 가 나온다
		}
}
