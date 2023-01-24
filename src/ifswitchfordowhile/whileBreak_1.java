package ifswitchfordowhile;

/*
 * ① 변수 선언;
 * while(②조건식){
  	③실행문
  	④증감식
  }*/
public class whileBreak_1 {
	public static void main(String[] args) {

		int cnt = 0; // ① 변수 선언 int i는 0 하고 집어 넣어 줬다
		while (true) { // ②조건식 while에 true(블린타입 트루를 줌) 를 줘서 무한반복 시키겟다 
			System.out.println("OK"); // ③실행문 ok라고 출력해라
			cnt = cnt + 2; // ④증감식 cnt를 +2증감시켜라
			// if (cnt == 10){} 이게 빠져나올 조건을 잡아주었다
			if (cnt == 10) { // if = cnt 값이 만약에 10과 같냐? 같다면
				break; // break 를 만나게 되면  break 뜻 => 현재 실행중인 반복문을 빠나와라 라는 이야기다
			}
			
			// true를 주면 무한루프가 돌지만 그냥 무한 루프가 아니라 내가 조건이 만족되는 그 조건이 되면 빠져나오게
			// 했기 때문에 true줘도 괜찮다 그래서 반드시 true 라고 줬을때에는 빠져나올 수 있는 조건을 break 문으로 명시를 해줘야 한다

		}

	}
}