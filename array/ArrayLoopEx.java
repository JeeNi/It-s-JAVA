package array;

public class ArrayLoopEx {

	public static void main(String[] args) {
		
		String[] members = {"������", "������", "���̶�"};
		
		/*
		for(int i = 0; i < members.length; i++) {
			String member = members[i];
			
		*/
		for (String e: members) {						// members�� ���� ���� e�� ���
			System.out.println(e + "�� ����� �޾ҽ��ϴ�");		// �߰�ȣ ���� ������ ����
		}
	}

}
