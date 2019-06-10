package object;

class Class2 {
	static double PI = 3.14;
	
	// Ŭ���� ������ base �߰�
	static int base = 0;
	int left, right;
	
	public void setOperands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		
		// ���ϱ⿡ base�� ���� ����
		System.out.println(this.left + this.right + base);
	}
	
	public void arg() {
		
		// ���ġ�� base�� ���� ����
		System.out.println((this.left + this.right + base) / 2);
	}
}

public class ClassEx2 {
	public static void main(String[] args) {
		Class2 c1 = new Class2();
		c1.setOperands(10, 20);
		
		// 30 ���
		c1.sum();
		
		Class2 c2 = new Class2();
		c2.setOperands(20, 40);
		
		// 60���
		c2.sum();
		
		// Ŭ���� ���� base�� ���� 10���� ����
		Class2.base = 10;
		
		// 40���
		c1.sum();
		
		// 70���
		c2.sum();
				
	}

}
