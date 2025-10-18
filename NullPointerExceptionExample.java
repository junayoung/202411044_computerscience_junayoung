package ch05.sec04;

public class NullPointerExceptionExample {

	public static void main(String[] args) {
		int[] intArray = null;
		// intArray[0] = 10; // NullPointerException
		
		String str = null;
		// System.out.println("총 문자수: " + str.length()); // NullPointerException

		int[] intArray1 = new int[3]; // 배열 객체 생성
		intArray1[0] = 10; // null이 아니라 오류 안남
		System.out.println(intArray1[0]);
		
		String str1 = "Hello";
		System.out.println("총 문자수: " + str1.length());
		
	}

}
