package cn.evan;

public class Test {

	public static void main(String[] args) {
		int expectedFlags = 2;
		int flags = 4;
		
		System.out.println((flags & expectedFlags) == expectedFlags);
		
		System.out.println(1 << 3);
	}
}
