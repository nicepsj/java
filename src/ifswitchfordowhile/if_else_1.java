package ifswitchfordowhile;

public class if_else_1 {
	public static void main(String[] args) {
		
		int score=90; //score 라는 변수 선언하고 90이라는 값을 넣어 주었다
		String result=""; // 문자열을 저장할 수 있는 result 란 변수를 선언  "" <<문자열이 없는 null값으로 넣어주었다 
		
		if(score>60) { // if문 조건체크중 스코어가 60보다 크냐? 
			result="합격"; // 그렇다면 result에다 합격이라는 문자열을 집어 넣어라
		}else {
			result="불합격";
		}
		System.out.println(result); // result를 찍어라 그럼 현재 90이기 때문에 리절트에는 합격이라는 게 찍힌다.
	
	}
}
