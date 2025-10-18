package ch05.sec05;

public class IndexOfContainsExample {

	public static void main(String[] args) {
		String subject = "자바 프로그래밍";
		
		int location = subject.indexOf("프로그래밍"); 
		// indexOf() 특정 문자열이 시작하는 인덱스를 찾아줌
		System.out.println(location);
		String substring = subject.substring(location);
		// substring() 문자열에서 일부 문자열을 잘라냄
		System.out.println(substring);
		
		location = subject.indexOf("자바"); 
		if(location != -1) { // 문자열 존재하지 않으면 -1 반환
			System.out.println("자바와 관련된 책이군요");
		} else {
			System.out.println("자바와 관련없는 책이군요");
		}
		
		boolean result = subject.contains("자바");
		// contain() 문자열이 포함되어 있는지 t/f로 반환
		if(result) { // result가 t 이면 실행
			System.out.println("자바와 관련된 책이군요");
		} else { // result가 f 이면 실행
			System.out.println("자바와 관련없는 책이군요");
			
		}
	}

}
