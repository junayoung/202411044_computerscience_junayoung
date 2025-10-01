package ch03.sec08;

public class BitLongicExample {

	public static void main(String[] args) {
		
		// 45 -> 00101101
		// 25 -> 00011001
		System.out.println("45 & 25 = " + (45 & 25)); // 00001001
		System.out.println("45 | 25 = " + (45 | 25)); // 00111101
		System.out.println("45 ^ 25 = " + (45 ^ 25)); // 00110100
		System.out.println("~45 = " + (~45)); // 11010010
		System.out.println("--------------------------");
		
		byte receiveData = -120; // 10001000
		
		// 비트 논리곱 연산으로 (255 -> 11111111)
		int unsignedInt1 = receiveData & 255;
		System.out.println(unsignedInt1);
		
		// 자바 API 이용 (Byte.toUnsignedInt)
		int unsignedInt2 = Byte.toUnsignedInt(receiveData);
		System.out.println(unsignedInt2);
		
		int test = 136;
		byte btest = (byte) test;
		System.out.println(btest);
	}

}
