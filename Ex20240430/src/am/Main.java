package am;

public class Main {

	public static void main(String[] args) {
		StaticTest st1 = new StaticTest(); // 모두들~ \n생성자
		System.out.println(StaticTest.msg); // 힘내라!
		System.out.println(StaticTest.getMsg()); // 모두들~ \n힘내라!

		StaticTest st2 = new StaticTest(); // 생성자
		st2.msg = "대한민국";
		System.out.println(StaticTest.msg); // 대한민국
		
		

	}

}
