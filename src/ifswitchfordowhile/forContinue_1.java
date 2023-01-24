package ifswitchfordowhile;

/*반복문 제어
2)Continue컨티뉴
- 현재 반복문의 실행을 멈추고 다음 반복문을 실행
- 실행순서*/

public class forContinue_1 {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {// i = 0 초기화 시켰다; i가 10보다 작으냐;
			if( (i%2) == 0 ) continue; // (i값이 2로 나눈 나머지값 구해주는 거다) 나머지 값이 == 0 이냐? 어떤수를 2로 나눴는데 나머지값이 0이라는 이야기는 짝수라는 이야기다
			// (i%2) == 0 일때 continue를 만나 즉시 해당부분을 탈출하고 다음반복이 실행되었다.
			System.out.println(i); // continue명령문을 만나면 그다음 반복문을 실행하지 않고 i++ 다음 증감 연산자로 간다
		}

	}
}
