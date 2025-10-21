package ch05.sec09;

public class ArrayCopyExample {

	public static void main(String[] args) {
		// 길이 3인 배열
		String[] oldStrArray = { "java", "array", "copy" };
		// 길이 5인 배열을 새로 생성
		String[] newStrArray = new String[5]; // 아직 복사 전이므로 모든 항목은 null
		// 배열 항목 복사 (원본배열, 원본시작인덱스, 복사배열, 복사시작인덱스, 복사길이)
		System.arraycopy( oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		// 배열 항목 출력
		for(int i=0; i<newStrArray.length; i++) {
			System.out.println(newStrArray[i] + ", ");
		}
	}

}
