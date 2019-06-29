package finals;

class Calculator{
	static final double PI = 3.14;
	
	// "������"�̶�� �κп��� static�� �� �� �ִµ� "�ٲ��� �ʴ�"�� ���� �������� �Ǵ� ������� ������ ����
	// �� ���� ���Ѵٸ� PI ������ ��� 3.14 ���� ����ϴ� �ʿ��� ������ �� ����
	// �� �� ����ϴ� ���� final
	// �ʵ忡 final�� �����ϸ� 3.14��� ���� ������ PI ���� �ٲ� �� ���� ����� ��
	
	int left, right;
	
	public void setOperands(int left, int right) {
		this.left = left;
		this.right = right;
		//Calculator.PI = 6;   // �׷��� PI ���� �����Ϸ��� �ϱ� ������ ������ ��
	}
	
	public void sum() {
		System.out.println(this.left + this.right);
	}
	
	public void avg() {
		System.out.println((this.left + this.right) / 2);
	}
}

public class FinalEx1 {

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		System.out.println(c1.PI);
		//Calculator.PI = 10;  // �� ���� ������ ��
	}

}
