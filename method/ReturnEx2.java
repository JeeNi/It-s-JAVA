package method;

public class ReturnEx2 {
	
	public static String[] getMembers() {
		
		// �޼ҵ� �ȿ� members��� ������ ����(�� ������ ���ڿ��� ���� �� �ִ� �迭)
		// �� �̸����� members��� ������ ����
		String[] members = {"������", "������", "���̶�"};
		
		// return���� members�� ��ȯ
		return members;
	}
	
	public static void main(String[] args) {
		String[] members = getMembers();
	}
}
	
	
	
	/*
	public static String getMember1() {
		return "������";
	}
	
	public static String getMember2() {
		return "������";
	}
	
	public static String getMember3() {
		return "���̶�";
	}
	
	public static void main(String[] args) {
		System.out.println(getMember1());
		System.out.println(getMember2());
		System.out.println(getMember3());
	}
	*/


