package scope;

public class ScopeGlobalVariable {
	static int i; 			// ��������
	
	static void a() {
		/*int*/i = 0;
	}

	public static void main(String[] args) {
		for (/*int*/ i = 0; i < 5; i++) {			// �ּ�ó�� int�� �־��ָ� 01234�� ��µ�
			a();
			System.out.println(i);
		}

	}

}
