package ifswitchfordowhile;

public class if_elseif_2 {
	public static void main(String[] args) {
		int score = 90; // score는 변수에 값이 90을 넣었다
		char grade; //grade 변수에는 char 문자값 한개가 저장이 되어 있다.  
		if(score >=90) { // score가 90보다 크거나 같냐? 90이상이냐고 물어보고 있다
			grade = 'A'; //1. 그렇다면 grade 에는 A가 들어가고 만약에 90 미만이였다
		}else if (score>=80) { // 2. 90미만일 경우에 여기로 넘어와서 조건을 체크 
			grade = 'B';
		}else if (score>=70) { // 3. else if조건은 몇개든 추가할 수 있다.
			grade = 'C';
		}else if (score>=60) {
			grade = 'D';
		}else {
			grade = 'F';
		}
		
	}
}
