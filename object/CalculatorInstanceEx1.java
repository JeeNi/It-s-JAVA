package object;

class Calculator1 {
	int left, right;
	
	public Calculator1(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println(this.left + this.right);
	}
	
	public void avg() {
		System.out.println((this.left + this.right) / 2);
	}
}

public class CalculatorInstanceEx1 {    				// �ڹٴ� ���������� Ŭ������ �Ȱ��� �̸��� �޼ҵ带
													 	// �ڵ����� ����� ��
	public static void main(String[] args) {			// ������ �ڵ����� �����, ������ ���� ���� ���� ���
		Calculator1 c1 = new Calculator1(10, 20);
		c1.sum();              // (�ν��Ͻ�) ������
		c1.avg();
		
		Calculator1 c2 = new Calculator1(20, 40);
		c2.sum();
		c2.avg();
	}

}
