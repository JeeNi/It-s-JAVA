package scope;

public class ScopeEx3 {

		static int i = 5;
		
		// ó���� 5�� ��µ�
		
		static void a() {
			int i = 10;
			b();
		}
		
		static void b() {
			int i = 30; 	// ��������      	// 30�� ��µ� 
			System.out.println(i);		// i�� ������ b() �޼ҵ��� ��ȿ������ ���ϱ� ����
		}								// ���������� ���� ������ ���ָ� ������ �߻�	
		
		public static void main(String[] arg) {
			int i = 1; // ������ 5�� ��µ�
			a();
		}
	}
				


