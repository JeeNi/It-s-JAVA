package abstractclass;

abstract class A {
	public abstract int b();
	// ��ü�� �ִ� �޼ҵ�� abstract Ű���带 ���� �� ����
	// public abstract int c(){System.out.println("Hello")}
	// �߻� Ŭ���� ������ �߻� �޼ҵ尡 �ƴ� �޼ҵ尡 ������ �� ����
	public void d() {
		System.out.println("world");
	}
}

class B extends A{
	
}

public class AbstractEx1 {

	public static void main(String[] args) {
		//A obj = new A();
		B obj = new B();
	}

}
