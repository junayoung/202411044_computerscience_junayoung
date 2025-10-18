package ch05.sec03;

public class ReferenceVaroableCompareExample {

	public static void main(String[] args) {
		int[] arr1; // 배열 변수 arr1 선언
		int[] arr2; 
		int[] arr3;
		
		arr1 = new int[] {1, 2, 3}; // 배열 {1, 2, 3}을 생성하고 arr1 변수에 대입
		arr2 = new int[] {1, 2, 3}; // 내용이 같더라도 각자 다른 메모리 공간에 만들어짐
		arr3 = arr2; // arr2 주소 그대로 복사. 완전히 같은 배열 객체를 가짐
		
		System.out.println(arr1 == arr2); // arr1과 arr2 변수 값이 동일한 번지인지 검사
		System.out.println(arr2 == arr3); // arr2와 arr3 변수가 같은 배열을 참조하는지 검사

	}

}
