package method;

public class ReturnEx1 {

	public static int one() {
		
		// sysout���� one() �̶�� �޼ҵ带 ȣ��
		// �� �޼ҵ�� return�� �� �� ����
		// ����� 1�� ġȯ
		// �ڹٴ� return�� ������ ���� return �ڿ� ������� ����
		// �޼Ҵ� �ٱ������� ��ȯ�ϸ鼭 �޼ҵ��� ������ ���� �����ϱ� ����
		return 1;
		return 2;
		return 3;
	}
	
	public static void main(String[] args) {
		System.out.println(one());
	}

}
