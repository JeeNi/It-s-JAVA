package exception;

class Calculator {
	int left, right;
	
	public void setOperands(int left, int right) {
		/*
		this.left = left;
		this.right = right;
		*/
		
		/*
		if(right == 0) {
			throw new IllegalArgumentException("�ι�° ������ ����  0�� �� �� �����ϴ�.");
		}
		this.left = left;
		this.right = right;
		*/
		this.left = left;
		this.right = right;
	}
	
	public void divide() {
		/*
		try {
			System.out.println("�������");
			System.out.println(this.left / this.right);
			System.out.println("�Դϴ�.");
		} catch (Exception e) {
			System.out.println("\n\ne.getMessage()\n" + e.getMessage());
			System.out.println("\n\ne.toString()\n" + e.toString());
			System.out.println("\n\ne.printStackTrace()");
			e.printStackTrace();
		}
		*/
		if(this.right == 0) {
			throw new ArithmeticException("0���� ������ ���� ������ �ʽ��ϴ�.");
		}
		try {
			System.out.print("������� ");
			System.out.println(this.left / this.right);
			System.out.println(" �Դϴ�.");
		} catch(Exception e) {
			System.out.println("\n\ne.getMessage()\n" + e.getMessage());
			System.out.println("\n\ne.toString()\n" + e.toString());
			System.out.println("\n\ne.printStackTrace()");
			e.printStackTrace();
		}
	}
}

public class CalculatorEx2 {
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.setOperands(10, 0);
		c1.divide();
	}
}
