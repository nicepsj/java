package ifswitchfordowhile;

public class switch_1 {
	public static void main(String[] args) {
		
		int a = 12;
		int b =2;
		char op = '+'; // op안에 변수 '+' 가 들어가 있다
		 switch (op) { //스위치 안에 op라는게 들어가있따
			case '+': // 첫번째 케이스가 모냐면 op가 '+'냐 라고 물어보는 조건식
				System.out.println(a+b); break; // 그렇다면 이걸 실행
			case '-': // 두번째 케이스는 op가 '-'냐? 라고 묻고 있는 조건식
				System.out.println(a-b); break;
			case '*': // op가 '*' 냐? 라고 물었는데 만약에 맞다고 하면 곱하기 해라 라는 것
				System.out.println(a*b); break;
			case '/':
				System.out.println(a/b); break;
		}
		
	}
}
