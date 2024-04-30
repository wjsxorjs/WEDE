package am;

public class StaticTest {
	
	int value = 10;
	static String msg = getMsg();
	
	
	public StaticTest() {
		System.out.println("생성자");
	}


	public static String getMsg() {
		// 해당 함수는 static으로 선언되야 하는데,
		// 그 이유는 static을 먼저 메모리에 적재하려고 한다.
		// 그런데 해당 함수가 static이 아닌 인스턴스일 경우
		// 생성 후 호출이 가능하므로 오류가 발생한다.
		System.out.println("모두들~");
		return "힘내라!";
	}
	
	

}
