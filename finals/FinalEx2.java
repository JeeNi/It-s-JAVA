package finals;

class A {
	final void b() {
		}
}

class B extends A{
	void b() {
		}
}

// B Ŭ�������� A Ŭ������ b() �޼ҵ带 �������̵� �ϸ� ���� �߻�
// �޼Ҵ��� final�� �����Ǹ� �ش� �޼ҵ�� �������̵��� �� ����

final class C{
	final void b() {
		}
}

class D extends C{
	}

// C Ŭ������ final�� �����ؼ� ���� ����� �� ���� ������ ���� �߻�