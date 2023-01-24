package ifswitchfordowhile;

/*
 * ① 변수 선언;
 * while(②조건식){
  	③실행문
  	④증감식
  }*/
public class while_1 {
	public static void main(String[] args) {
		
		int i =0; //  ① 변수 선언 int i는 0 하고 집어 넣어 줬다
		while(i<10) { // i는 10보다 작다 ②조건식 체크 
			System.out.println(i); //③실행문
			i++; // 	④증감식
			}
		System.out.println("OK");
		}
}
