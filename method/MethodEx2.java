package method;

public class MethodEx2 {

	public static String numbering (int init, int limit) {
		int i = init;
		
		// ����� ���� ���ڸ� output ������ ��� ����
		// ������ �� ���� �Ҵ�
		String output = "";
		while (i < limit) {
			// ���ڸ� ȭ�鿡 ����ϴ� ��� output ������ ����
			output += i;
			i++;
			
		}
		// **�߿�
		// output�� ��� ���ڿ��� �޼ҵ� �ܺη� ��ȯ�Ϸ���
		// �Ʒ��� ���� return Ű���� �ڿ� ��ȯ�Ϸ��� ���� ��ġ
		return output;
		
	}
	
	public static void main(String[] args) {
		// numbering �޼ҵ尡 ��ȯ�� ���� result ������ ���
		String result = numbering (1, 5);
		// result ������ ���� ȭ�鿡 ���
		System.out.println(result);
		// mail(result);
		// file(result);
	}

}
